package br.com.projetofinal.controller;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.com.projetofinal.model.Empresa;
import br.com.projetofinal.service.EmpresaService;
import br.com.projetofinal.tx.Transacional;

@SuppressWarnings("serial")
@Model
public class EmpresaController implements Serializable {


	@Inject
	private EmpresaService service;

	private Empresa empresa = new Empresa();

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	@Transacional
	public void salvar() {
		service.salvar(empresa);
	}

	public void editar() {
		service.editar(empresa);
	}

	public Empresa buscaPorId(Long id) {
		return service.buscaPorId(id);
	}

	public List<Empresa> listarTudo() {
		return service.listarTudo();
	}

}
