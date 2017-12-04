package br.com.projetofinal.architecture.service;

import br.com.projetofinal.architecture.dao.GenericDAO;
import br.com.projetofinal.architecture.model.GenericModel;

public abstract class GenericService<Entidade extends GenericModel> {

	private GenericDAO<Entidade> dao;

	public void salvar(Entidade entidade) {
		dao.salvar(entidade);
	}

	public void editar(Entidade entidade) {
		dao.editar(entidade);
	}

	public void ativar(Entidade entidade) {
		dao.ativar(entidade);
	}

	public void inativar(Entidade entidade) {
		dao.inativar(entidade);
	}

	public Entidade buscaPorId(Long id) {
		return dao.buscaPorId(id);
	}

}
