package dao;

import java.util.List;

import javax.persistence.Query;
import model.Pacientes;

public class DaoPaciente<e> extends DaoGeneric<Pacientes> {
	
	public List<Pacientes> pesquisarNome(String pesquisa){
		Query query = super.getEntityManager().createQuery("from Pacientes where nomeCompleto like '%" + pesquisa + "%' order by nomeCompleto asc");
		return query.getResultList();
	}

}
