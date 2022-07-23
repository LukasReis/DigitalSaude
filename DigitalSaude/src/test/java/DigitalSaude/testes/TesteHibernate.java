package DigitalSaude.testes;

//Classe resposável por testar o método de criação das tabelas utilizando o hibernate

import org.junit.Test;

import hibernate.HibernateUtil;


public class TesteHibernate {

	@Test
	public void testeHibernateUtil() {
		HibernateUtil.getEntityManager();
	}

}