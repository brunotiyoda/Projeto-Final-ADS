package br.com.projetofinal.architecture.controller;

import java.io.Serializable;

import br.com.projetofinal.architecture.model.GenericModel;
import br.com.projetofinal.architecture.service.GenericService;

@SuppressWarnings("serial")
public abstract class GenericController<Entidade extends GenericModel> implements Serializable {

	private GenericService<Entidade> service;

}
