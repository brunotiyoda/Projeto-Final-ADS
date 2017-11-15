package br.com.projetofinal.controller;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.com.projetofinal.model.Cargo;
import br.com.projetofinal.model.Departamento;
import br.com.projetofinal.model.Empresa;
import br.com.projetofinal.model.Funcionario;
import br.com.projetofinal.service.CargoService;
import br.com.projetofinal.service.DepartamentoService;
import br.com.projetofinal.service.EmpresaService;
import br.com.projetofinal.service.FuncionarioService;
import br.com.projetofinal.tx.Transacional;

@SuppressWarnings("serial")
@Model
public class FuncionarioController implements Serializable {

	@Inject
	private FuncionarioService funcionarioService;

	@Inject
	private CargoService cargoService;

	@Inject
	private DepartamentoService departamentoService;

	@Inject
	private EmpresaService empresaService;

	private Funcionario funcionario = new Funcionario();
	private Empresa empresa = new Empresa();
	private Departamento departamento = new Departamento();
	private Cargo cargo = new Cargo();

	private Long empresaId;
	private Long departamentoId;
	private Long cargoId;

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Long getEmpresaId() {
		return empresaId;
	}

	public void setEmpresaId(Long empresaId) {
		this.empresaId = empresaId;
	}

	public Long getDepartamentoId() {
		return departamentoId;
	}

	public void setDepartamentoId(Long departamentoId) {
		this.departamentoId = departamentoId;
	}

	public Long getCargoId() {
		return cargoId;
	}

	public void setCargoId(Long cargoId) {
		this.cargoId = cargoId;
	}

	public void limparForm() {
		funcionario = new Funcionario();
		empresa = new Empresa();
		departamento = new Departamento();
		cargo = new Cargo();
	}

	@Transacional
	public void salvar() {
		cargo = cargoService.buscaPorId(cargoId);
		departamento = departamentoService.buscaPorId(departamentoId);
		empresa = empresaService.buscaPorId(empresaId);
		
		funcionario.setAtivo(true);
		funcionario.setEmpresa(empresa);
		funcionario.setCargo(cargo);
		funcionario.setDepartamento(departamento);
		
		funcionarioService.salvar(funcionario);

		limparForm();
	}

	public void editar() {
		funcionarioService.editar(funcionario);
	}

	public void ativar() {
		funcionarioService.ativar(funcionario);
	}

	public void inativar() {
		funcionarioService.inativar(funcionario);
	}

	public Funcionario buscaPorId(Long id) {
		return funcionarioService.buscaPorId(id);
	}

	/* listas */
	public List<Funcionario> getFuncionarios() {
		return funcionarioService.listarTudo();
	}

	public List<Cargo> getCargos() {
		return cargoService.listarTudo();
	}

	public List<Departamento> getDepartamentos() {
		return departamentoService.listarTudo();
	}

	public List<Empresa> getEmpresas() {
		return empresaService.listarTudo();
	}
}
