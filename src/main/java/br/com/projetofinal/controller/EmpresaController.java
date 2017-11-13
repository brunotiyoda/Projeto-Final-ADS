package br.com.projetofinal.controller;

import java.io.Serializable;
import java.util.List;

import br.com.projetofinal.model.Empresa;
import br.com.projetofinal.service.EmpresaService;

@SuppressWarnings("serial")
public class EmpresaController implements Serializable {

	private GenericController<Empresa> controller;

	private EmpresaService service;

	private Empresa empresa = new Empresa();

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public void salvar(Empresa entidade) {
		controller.salvar(entidade);
	}

	public void editar(Empresa entidade) {
		controller.editar(entidade);
	}

	public void ativar(Empresa entidade) {
		controller.ativar(entidade);
	}

	public void inativar(Empresa entidade) {
		controller.inativar(entidade);
	}

	public Empresa buscaPorId(Long id) {
		return controller.buscaPorId(id);
	}

	public List<Empresa> listarTudo() {
		return service.listarTudo();
	}

}
