package br.com.projetofinal.model.test;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.projetofinal.model.Departamento;
import br.com.projetofinal.util.JPAUtil;

public class DepartamentoListTest {

	public static void main(String[] args) {
		JPAUtil jpaUtil = new JPAUtil();

		EntityManager entityManager = jpaUtil.getEntityManager();

		String jpql = "SELECT c FROM Departamento c ";
		List<Departamento> departamentos = entityManager.createQuery(jpql, Departamento.class).getResultList();
		entityManager.close();

		for (Departamento departamento : departamentos) {
			System.out.println(departamento.getId());
			System.out.println(departamento.getDepartamento());
			System.out.println(departamento.getFuncionario().getNome());
		}
	}
}
