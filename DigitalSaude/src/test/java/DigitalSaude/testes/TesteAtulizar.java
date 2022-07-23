package DigitalSaude.testes;

//Classe responsável por testar o método que atualiza entidades do banco

import org.junit.Test;
import dao.DaoGeneric;
import model.Enfermeiros;
import model.Medicos;
import model.TecsEnfermagem;

public class TesteAtulizar {

	@Test
	public void testeAtulizar() {
		DaoGeneric<Medicos> daoGeneric = new DaoGeneric<Medicos>();
		Medicos medicos = daoGeneric.retornar(1L, Medicos.class);
		medicos.setSenha("123456789");
		medicos = daoGeneric.atualizar(medicos);
		System.out.println(medicos);

	}

	@Test
	public void testarListarEnfermeiros() {
		DaoGeneric<Enfermeiros> daoGeneric = new DaoGeneric<Enfermeiros>();
		Enfermeiros enfermeiros = daoGeneric.retornar(1L, Enfermeiros.class);
		enfermeiros.setSenha("123354");
		enfermeiros = daoGeneric.atualizar(enfermeiros);
		System.out.println(enfermeiros);

	}

	@Test
	public void testarListarTecsEnfermagem() {
		DaoGeneric<TecsEnfermagem> daoGeneric = new DaoGeneric<TecsEnfermagem>();
		TecsEnfermagem tecsEnfer = daoGeneric.retornar(1L, TecsEnfermagem.class);
		tecsEnfer.setSenha("123354");
		tecsEnfer = daoGeneric.atualizar(tecsEnfer);
		System.out.println(tecsEnfer);

	}

}