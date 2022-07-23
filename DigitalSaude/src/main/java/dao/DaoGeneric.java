package dao;

//Classe responsavel por realizar as operações no banco de dados 

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import hibernate.HibernateUtil;
import model.Pacientes;

public class DaoGeneric<E> {

	private EntityManager entityManager = HibernateUtil.getEntityManager();

	// Metodo responsável por salvar uma entidade no banco de dados
	
	public void salvar(E entidade) {
		EntityTransaction trasaction = entityManager.getTransaction();
		trasaction.begin();
		entityManager.persist(entidade);
		trasaction.commit();

	}

	// Metodo responsável por retornar todas as entidades dentro do banco de dados
	
	public E retornar(Long id, Class<E> entidade) {
		E e = (E) entityManager.find(entidade, id);
		return e;
	}

	// Método responsavel por atulizar uma entidade 
	
	public E atualizar(E entidade) {
		EntityTransaction trasaction = entityManager.getTransaction();
		trasaction.begin();
		E entidadeAtualizada = entityManager.merge(entidade);
		trasaction.commit();
		return entidadeAtualizada;

	}
	
	//Método responsavel por deletar uma entidade
	
	public void deletar(E entidade) {
		Object id = HibernateUtil.getPrimarKay(entidade);
		EntityTransaction trasaction = entityManager.getTransaction();
		trasaction.begin();
		entityManager.createNativeQuery("delete from "
				+entidade.getClass().getSimpleName().toLowerCase()+
				" where id="+id).executeUpdate();
		trasaction.commit();
		
	}
	
	//Método responsavel por gerar o entityManager
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
}