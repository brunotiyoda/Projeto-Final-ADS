package br.com.projetofinal.controller;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.com.projetofinal.model.Cargo;
import br.com.projetofinal.model.Empresa;
import br.com.projetofinal.service.CargoService;
import br.com.projetofinal.service.EmpresaService;
import br.com.projetofinal.tx.Transacional;

@SuppressWarnings("serial")
@Model
public class CargoController implements Serializable {

	@Inject
	private CargoService cargoService;

	@Inject
	private EmpresaService empresaService;

	private Cargo cargo = new Cargo();
	private Empresa empresa = new Empresa();

	private Long empresaId;

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
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
		cargo = new Cargo();
		empresa = new Empresa();
	}

	@Transacional
	public void salvar() {
		empresa = empresaService.buscaPorId(empresaId);
		cargo.setEmpresa(empresa);
		cargoService.salvar(cargo);
		
		limpaForm();
	}

	public void editar() {
		cargoService.editar(cargo);
	}

	public Cargo buscaPorId(Long id) {
		return cargoService.buscaPorId(id);
	}

	/* listas */
	public List<Cargo> getCargos() {
		return cargoService.listarTudo();
	}

	public List<Empresa> getEmpresas() {
		return empresaService.listarTudo();
	}

}
