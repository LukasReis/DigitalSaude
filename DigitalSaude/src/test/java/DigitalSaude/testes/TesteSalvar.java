package DigitalSaude.testes;

//Classe responsável por testar o método que salva entidades no banco

import org.junit.Test;
import dao.DaoGeneric;
import model.Enfermeiros;
import model.Medicos;
import model.Pacientes;
import model.TecsEnfermagem;

import java.time.LocalDate;
import java.time.Month;

public class TesteSalvar {

	@Test
	public void salvarPrimeiraEntidadeMedico() {
		DaoGeneric<Medicos> daoGeneric = new DaoGeneric<Medicos>();
		Medicos medicos = new Medicos();

		medicos.setNomeCompleto("Yasmim do Carlo");
		medicos.setCpf("367.495.410-97");
		medicos.setGenero("Feminimo");
		medicos.setDataNascimento(LocalDate.of(1965, Month.JANUARY, 19));
		medicos.setCrm("CRM/SP 123456");
		medicos.setEmail("yasminalmeidamartins@dayrep.com");
		medicos.setSenha("8989895");
		medicos.setTelefone("(61) 5096-9555");

		daoGeneric.salvar(medicos);

	}

	@Test
	public void salvarEntidadeEnfermeiros() {
		DaoGeneric<Enfermeiros> daoGeneric = new DaoGeneric<Enfermeiros>();
		Enfermeiros enfermeiros = new Enfermeiros();

		enfermeiros.setNomeCompleto("Yasmim do Carlo");
		enfermeiros.setCpf("367.495.410-97");
		enfermeiros.setGenero("Feminimo");
		enfermeiros.setDataNascimento(LocalDate.of(1965, Month.JANUARY, 19));
		enfermeiros.setCorem("CRM/SP 123456");
		enfermeiros.setEmail("yasminalmeidamartins@dayrep.com");
		enfermeiros.setSenha("8989895");
		enfermeiros.setTelefone("(61) 5096-9555");

		daoGeneric.salvar(enfermeiros);

	}

	@Test
	public void salvarEntidadeTecsEnfermagem() {
		DaoGeneric<TecsEnfermagem> daoGeneric = new DaoGeneric<TecsEnfermagem>();
		TecsEnfermagem tecsEnf = new TecsEnfermagem();

		tecsEnf.setNomeCompleto("Yasmim do Carlo");
		tecsEnf.setCpf("367.495.410-97");
		tecsEnf.setGenero("Feminimo");
		tecsEnf.setDataNascimento(LocalDate.of(1965, Month.JANUARY, 19));
		tecsEnf.setCorem("CRM/SP 123456");
		tecsEnf.setEmail("yasminalmeidamartins@dayrep.com");
		tecsEnf.setSenha("8989895");
		tecsEnf.setTelefone("(61) 5096-9555");

		daoGeneric.salvar(tecsEnf);

	}

	@Test
	public void salvarEntidadePacientes() {
		DaoGeneric<Pacientes> daoGeneric = new DaoGeneric<Pacientes>();
		Pacientes pacientes = new Pacientes();

		pacientes.setNomeCompleto("lucas2");
		pacientes.setCpf("lucas2");
		pacientes.setDataNascimento(LocalDate.of(2000, Month.OCTOBER, 12));
		pacientes.setGenero("lucas2");
		pacientes.setTelefone("88888888");
		pacientes.setEmail("lucas2");
		pacientes.setSenha("lucas2");

		daoGeneric.salvar(pacientes);

	}

}