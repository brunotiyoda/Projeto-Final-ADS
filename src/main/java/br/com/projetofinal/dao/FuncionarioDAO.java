package br.com.projetofinal.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.projetofinal.model.Funcionario;

@SuppressWarnings("serial")
public class FuncionarioDAO implements Serializable {

	@Inject
	private EntityManager entityManager;

	private GenericDAO<Funcionario> dao;

	@PostConstruct
	public void init() {
		this.dao = new GenericDAO<Funcionario>(this.entityManager, Funcionario.class);
	}

	public void salvar(Funcionario entidade) {
		dao.salvar(entidade);
	}

	public void editar(Funcionario entidade) {
		dao.editar(entidade);
	}

	public void ativar(Funcionario entidade) {
		dao.ativar(entidade);
	}

	public void inativar(Funcionario entidade) {
		dao.inativar(entidade);
	}

	public Funcionario buscaPorId(Long id) {
		return dao.buscaPorId(id);
	}

	public boolean buscaLogin(Funcionario funcionario) {

		TypedQuery<Funcionario> query = entityManager.createQuery("SELECT e FROM Empresa e WHERE e.cpf = :pCpf AND u.senha = :pSenha", Funcionario.class);
		query.setParameter("pCpf", funcionario.getCpf());
		query.setParameter("pSenha", funcionario.getSenha());

		Funcionario resultado = query.getSingleResult();

		return resultado != null;
	}

	public List<Funcionario> listarTudo() {
		String jpql;
		jpql = "SELECT f FROM Funcionario f ORDER BY f.nome";
		return entityManager.createQuery(jpql, Funcionario.class).getResultList();
	}

}
