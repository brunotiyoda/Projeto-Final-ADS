package br.com.projetofinal.controller;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.com.projetofinal.model.Funcionario;
import br.com.projetofinal.service.FuncionarioService;
import br.com.projetofinal.tx.Transacional;

@SuppressWarnings("serial")
@Model
public class FuncionarioController implements Serializable {

	private GenericController<Funcionario> controller;

	@Inject
	private FuncionarioService funcionarioService;

	private Funcionario funcionario = new Funcionario();

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@Transacional
	public void salvar(Funcionario entidade) {
		controller.salvar(entidade);
	}

	public void editar(Funcionario entidade) {
		controller.editar(entidade);
	}

	public void ativar(Funcionario entidade) {
		controller.ativar(entidade);
	}

	public void inativar(Funcionario entidade) {
		controller.inativar(entidade);
	}

	public Funcionario buscaPorId(Long id) {
		return controller.buscaPorId(id);
	}

	public List<Funcionario> listarTudo() {
		return funcionarioService.listarTudo();
	}

}
