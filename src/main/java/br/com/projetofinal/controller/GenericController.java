package br.com.projetofinal.controller;

import java.io.Serializable;

import br.com.projetofinal.model.GenericModel;
import br.com.projetofinal.service.GenericService;

@SuppressWarnings("serial")
public class GenericController<Entidade extends GenericModel> implements Serializable {

	private GenericService<Entidade> service;

	public GenericController(GenericService<Entidade> service) {
		this.service = service;
	}

	public void salvar(Entidade entidade) {
		service.salvar(entidade);
	}

	public void editar(Entidade entidade) {
		service.editar(entidade);
	}

	public void ativar(Entidade entidade) {
		service.ativar(entidade);
	}

	public void inativar(Entidade entidade) {
		service.inativar(entidade);
	}

	public Entidade buscaPorId(Long id) {
		return service.buscaPorId(id);
	}

}
