package br.com.projetofinal.model.test;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.projetofinal.model.Funcionario;
import br.com.projetofinal.util.JPAUtil;

public class FuncionarioListTest {

	public static void main(String[] args) {
		JPAUtil jpaUtil = new JPAUtil();

		EntityManager entityManager = jpaUtil.getEntityManager();

		String jpql = "SELECT c FROM Funcionario c ";
		List<Funcionario> funcionarios = entityManager.createQuery(jpql, Funcionario.class).getResultList();
		entityManager.close();

		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario.getId());
			System.out.println(funcionario.isAtivo());
			System.out.println(funcionario.getCargo().getCargo());
			System.out.println(funcionario.getNome());
			System.out.println(funcionario.getCpf());
			System.out.println(funcionario.getSenha());
			System.out.println(funcionario.getEmpresa().getNome());
		}
	}
}
