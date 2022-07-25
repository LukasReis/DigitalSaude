package DigitalSaude.testes;

import java.util.List;

//Classe responsável por testar o método que lista entidades do banco

import org.junit.Test;

import model.Enfermeiros;
import model.Medicos;
import model.Pacientes;
import model.TecsEnfermagem;
import dao.DaoGeneric;
import dao.DaoPaciente;

public class TesteListar {

	@Test
	public void testarListarMedicos() {
		DaoGeneric<Medicos> daoGeneric = new DaoGeneric<Medicos>();
		Medicos medicos = daoGeneric.retornar(1L, Medicos.class);
		System.out.println(medicos);

	}

	@Test
	public void testarListarEnfermeiros() {
		DaoGeneric<Enfermeiros> daoGeneric = new DaoGeneric<Enfermeiros>();
		Enfermeiros enfermeiros = daoGeneric.retornar(1L, Enfermeiros.class);
		System.out.println(enfermeiros);

	}

	@Test
	public void testarListarTecsEnfermagem() {
		DaoGeneric<TecsEnfermagem> daoGeneric = new DaoGeneric<TecsEnfermagem>();
		TecsEnfermagem tecsEnfer = daoGeneric.retornar(1L, TecsEnfermagem.class);
		System.out.println(tecsEnfer);

	}
	
	@Test
	public void testarListarPaciente() {
		DaoGeneric<Pacientes> daoGeneric = new DaoGeneric<Pacientes>();
		DaoGeneric<Pacientes> daoPaciente = new DaoPaciente<Pacientes>();
		List<Pacientes> pacientes = daoGeneric.listar(Pacientes.class);
		System.out.println(pacientes);

	}

}