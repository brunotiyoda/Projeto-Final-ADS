package br.com.projetofinal.controller;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.com.projetofinal.model.Departamento;
import br.com.projetofinal.service.DepartamentoService;

@SuppressWarnings("serial")
@Model
public class DepartamentoController implements Serializable {

	private GenericController<Departamento> controller;

	@Inject
	private DepartamentoService service;

	private Departamento departamento = new Departamento();

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public void salvar(Departamento entidade) {
		controller.salvar(entidade);
	}

	public void editar(Departamento entidade) {
		controller.editar(entidade);
	}

	public void ativar(Departamento entidade) {
		controller.ativar(entidade);
	}

	public void inativar(Departamento entidade) {
		controller.inativar(entidade);
	}

	public Departamento buscaPorId(Long id) {
		return controller.buscaPorId(id);
	}

	public List<Departamento> listarTudo() {
		return service.listarTudo();
	}

}
