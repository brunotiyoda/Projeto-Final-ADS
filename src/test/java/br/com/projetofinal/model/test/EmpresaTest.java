/*
package br.com.projetofinal.model.test;

import javax.persistence.EntityManager;

import br.com.projetofinal.model.Empresa;
import br.com.projetofinal.util.JPAUtil;

public class EmpresaTest {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		empresa.setCnpj("04998746000197");
		empresa.setNome("Yoda");
		empresa.setSenha("1234");

		EntityManager entityManager = new JPAUtil().getEntityManager();

		entityManager.getTransaction().begin();
		entityManager.persist(empresa);

		entityManager.getTransaction().commit();
		entityManager.close();

	}

}
*/
