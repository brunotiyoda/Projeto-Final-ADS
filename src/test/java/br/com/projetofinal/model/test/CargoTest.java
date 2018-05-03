/*
package br.com.projetofinal.model.test;

import javax.persistence.EntityManager;

import br.com.projetofinal.model.Cargo;
import br.com.projetofinal.util.JPAUtil;

public class CargoTest {
	public static void main(String[] args) {
		Cargo cargo = new Cargo();
		cargo.setCargo("RH");

		EntityManager entityManager = new JPAUtil().getEntityManager();

		entityManager.getTransaction().begin();
		entityManager.persist(cargo);

		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
*/
