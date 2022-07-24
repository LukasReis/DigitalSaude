package dao;

import java.util.List;

import jakarta.persistence.Query;
import model.Pacientes;

public class DaoPaciente<e> extends DaoGeneric<Pacientes> {
	
	public List<Pacientes> pesquisarNome(String pesquisa){
		Query query = (Query) super.getEntityManager().createQuery("from pacientes where nomeCompleto like '%" + pesquisa + "%' order by nomeCompleto asc");
		return query.getResultList();
	}

}
