/*
package br.com.projetofinal.model.test;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.projetofinal.model.Cargo;
import br.com.projetofinal.util.JPAUtil;

public class CargoListTest {
	public static void main(String[] args) {
		JPAUtil jpaUtil = new JPAUtil();

		EntityManager entityManager = jpaUtil.getEntityManager();

		String jpql = "SELECT c FROM Cargo c ";
		List<Cargo> cargos = entityManager.createQuery(jpql, Cargo.class).getResultList();

		
		String busca = "SELECT c FROM Cargo c WHERE id = 1";
		List<Cargo> buscas = entityManager.createQuery(busca, Cargo.class).getResultList();
		
		entityManager.close();
		
		for (Cargo cargo : cargos) {
			System.out.println(cargo.getId() + " " + cargo.getCargo());
		}
		
		System.out.println("---");
		System.out.println("Buscas");
		for (Cargo cargoEncontrado : buscas) {
			System.out.println(cargoEncontrado.getId() + " " + cargoEncontrado.getCargo());
		}
		
	}
}
*/
