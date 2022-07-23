package DigitalSaude.testes;

//Classe responsável por testar o método que "deleta" entidades do banco

import org.junit.Test;
import dao.DaoGeneric;
import model.Enfermeiros;
import model.Medicos;
import model.TecsEnfermagem;

public class TesteDeletar {

	@Test
	public void testarListar() {
		DaoGeneric<Medicos> daoGeneric = new DaoGeneric<Medicos>();
		Medicos medicos = daoGeneric.retornar(1L, Medicos.class);
		daoGeneric.deletar(medicos);
	}

	@Test
	public void testarListarEnfermeiros() {
		DaoGeneric<Enfermeiros> daoGeneric = new DaoGeneric<Enfermeiros>();
		Enfermeiros enfermeiros = daoGeneric.retornar(1L, Enfermeiros.class);
		daoGeneric.deletar(enfermeiros);
	

	}

	@Test
	public void testarListarTecsEnfermagem() {
		DaoGeneric<TecsEnfermagem> daoGeneric = new DaoGeneric<TecsEnfermagem>();
		TecsEnfermagem tecsEnfer = daoGeneric.retornar(1L, TecsEnfermagem.class);
		daoGeneric.deletar(tecsEnfer);
		

	}
}