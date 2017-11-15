package br.com.projetofinal.controller;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.com.projetofinal.model.Departamento;
import br.com.projetofinal.model.Empresa;
import br.com.projetofinal.service.DepartamentoService;
import br.com.projetofinal.service.EmpresaService;
import br.com.projetofinal.tx.Transacional;

@SuppressWarnings("serial")
@Model
public class DepartamentoController implements Serializable {

	@Inject
	private DepartamentoService departamentoService;

	@Inject
	private EmpresaService empresaService;

	private Departamento departamento = new Departamento();
	private Empresa empresa = new Empresa();

	private Long empresaId;

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Long getEmpresaId() {
		return empresaId;
	}

	public void setEmpresaId(Long empresaId) {
		this.empresaId = empresaId;
	}

	public void limpaForm() {
		departamento = new Departamento();
		empresa = new Empresa();
	}

	@Transacional
	public void salvar() {
		empresa = empresaService.buscaPorId(empresaId);
		departamento.setEmpresa(empresa);

		departamentoService.salvar(departamento);

		limpaForm();
	}

	public void editar() {
		departamentoService.editar(departamento);
	}

	public Departamento buscaPorId(Long id) {
		return departamentoService.buscaPorId(id);
	}

	/* listas */
	public List<Departamento> getDepartamentos() {
		return departamentoService.listarTudo();
	}

	public List<Empresa> getEmpresas() {
		return empresaService.listarTudo();
	}

}
