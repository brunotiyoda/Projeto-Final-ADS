package br.com.projetofinal.service;

import br.com.projetofinal.dao.GenericDAO;
import br.com.projetofinal.model.GenericModel;

public class GenericService<Entidade extends GenericModel> {

	private GenericDAO<Entidade> dao;

	public GenericService(GenericDAO<Entidade> dao) {
		this.dao = dao;
	}

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
