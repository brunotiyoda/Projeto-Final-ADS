/*
package br.com.projetofinal.model.test;

import javax.persistence.EntityManager;

import br.com.projetofinal.dao.CargoDAO;
import br.com.projetofinal.dao.EmpresaDAO;
import br.com.projetofinal.model.Cargo;
import br.com.projetofinal.model.Empresa;
import br.com.projetofinal.model.Funcionario;
import br.com.projetofinal.util.JPAUtil;

public class FuncionarioTest {
	public static void main(String[] args) {
		EntityManager entityManager = new JPAUtil().getEntityManager();
		
		entityManager.getTransaction().begin();

		Funcionario funcionario = new Funcionario();

		Cargo cargo = new Cargo();
		CargoDAO cargoDAO = new CargoDAO();
		cargo = cargoDAO.buscaPorId(1L); // desenvolvedor

		Empresa empresa = new Empresa(); 
		EmpresaDAO empresaDAO = new EmpresaDAO();
		empresa = empresaDAO.buscaPorId(1L);

		funcionario.setAtivo(true);
		funcionario.setCargo(cargo);
		funcionario.setCpf("03655597177");
		funcionario.setNome("Bruno Yudi Tiyoda");
		funcionario.setEmpresa(empresa);
		
		entityManager.persist(funcionario);

		entityManager.getTransaction().commit();
		entityManager.close();


	}
}*/
