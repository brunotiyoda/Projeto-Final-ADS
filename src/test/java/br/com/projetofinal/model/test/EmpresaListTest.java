/*
package br.com.projetofinal.model.test;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.projetofinal.model.Empresa;
import br.com.projetofinal.util.JPAUtil;

public class EmpresaListTest {

	public static void main(String[] args) {
		JPAUtil jpaUtil = new JPAUtil();

		EntityManager entityManager = jpaUtil.getEntityManager();

		String jpql = "SELECT c FROM Empresa c ";
		List<Empresa> empresas = entityManager.createQuery(jpql, Empresa.class).getResultList();
		entityManager.close();

		for (Empresa empresa : empresas) {
			System.out.println(empresa.getId());
			System.out.println(empresa.getCnpj());
			System.out.println(empresa.getNome());
			System.out.println(empresa.getSenha());
		}
	}
}
*/
