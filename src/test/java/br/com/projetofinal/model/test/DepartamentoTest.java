/*
package br.com.projetofinal.model.test;

import javax.persistence.EntityManager;

import br.com.projetofinal.dao.FuncionarioDAO;
import br.com.projetofinal.model.Departamento;
import br.com.projetofinal.model.Funcionario;
import br.com.projetofinal.util.JPAUtil;

public class DepartamentoTest {
	public static void main(String[] args) {
		Departamento departamento = new Departamento();
		Funcionario funcionario = new Funcionario();
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		
		funcionario = funcionarioDAO.buscaPorId(1L);

		EntityManager entityManager = new JPAUtil().getEntityManager();

		entityManager.getTransaction().begin();

		entityManager.persist(departamento);

		entityManager.getTransaction().commit();
		entityManager.close();

	}
}
*/
