package br.com.projetofinal.dao;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

import br.com.projetofinal.model.Funcionario;

@SuppressWarnings("serial")
public class FuncionarioDAO implements Serializable {

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

}
