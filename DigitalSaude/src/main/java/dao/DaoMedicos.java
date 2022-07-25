package dao;
import java.util.List;
import javax.persistence.Query;
import model.Medicos;

public class DaoMedicos<e> extends DaoGeneric<Medicos> {
	
	public List<Medicos> pesquisarNome(String nome){
		Query query =  super.getEntityManager()
			.createQuery("from Medicos where nomeCompleto like '%" + nome + "%' order by nomeCompleto asc");
		return query.getResultList();
	}


	} 