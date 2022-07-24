package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import hibernate.HibernateUtil;

public class DaoGeneric<E> {

	private EntityManager entityManager = HibernateUtil.getEntityManager();
	
	public void salvar(E entidade) {
		EntityTransaction trasaction = entityManager.getTransaction();
		trasaction.begin();
		entityManager.persist(entidade);
		trasaction.commit();

	}
	
	public E retornar(Long id, Class<E> entidade) {
		E e = (E) entityManager.find(entidade, id);
		return e;
	}

	public E atualizar(E entidade) {
		EntityTransaction trasaction = entityManager.getTransaction();
		trasaction.begin();
		E entidadeAtualizada = entityManager.merge(entidade);
		trasaction.commit();
		return entidadeAtualizada;

	}
	
	public void deletar(E entidade) {
		Object id = HibernateUtil.getPrimaryKey(entidade);
		EntityTransaction trasaction = entityManager.getTransaction();
		trasaction.begin();
		entityManager.createNativeQuery("delete from "
				+entidade.getClass().getSimpleName().toLowerCase()+
				" where id="+id).executeUpdate();
		trasaction.commit();
		
	}
	
	public List<E> listar (Class<E> entidade){
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		List<E> lista = entityManager.createQuery("from "+ entidade.getName()).getResultList();
		return lista;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}
	
}