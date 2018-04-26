package br.com.projetofinal.dao;

import br.com.projetofinal.architecture.dao.GenericDAO;
import br.com.projetofinal.model.Empresa;

import javax.persistence.TypedQuery;
import java.util.List;

public class EmpresaDAO extends GenericDAO<Empresa> {

	public boolean buscaLogin(Empresa empresa) {

		TypedQuery<Empresa> query = getEntityManager().createQuery("SELECT e FROM Empresa e WHERE e.cnpj = :pCnpj AND e.senha = :pSenha", Empresa.class);
		query.setParameter("pCnpj", empresa.getCnpj());
		query.setParameter("pSenha", empresa.getSenha());

		Empresa resultado = query.getSingleResult();

		return resultado != null;
	}

	public List<Empresa> listarTudo() {
		String jpql;
		jpql = "SELECT e FROM Empresa e ORDER BY e.nome";
		return getEntityManager().createQuery(jpql, Empresa.class).getResultList();
	}

}
