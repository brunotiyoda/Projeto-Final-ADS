package br.com.projetofinal.service;

import java.util.List;

import javax.inject.Inject;

import br.com.projetofinal.dao.FuncionarioDAO;
import br.com.projetofinal.model.Funcionario;

public class FuncionarioService {

	@Inject
	private FuncionarioDAO dao;

	private GenericService<Funcionario> service;

	public void salvar(Funcionario entidade) {
		service.salvar(entidade);
	}

	public void editar(Funcionario entidade) {
		service.editar(entidade);
	}

	public void ativar(Funcionario entidade) {
		service.ativar(entidade);
	}

	public void inativar(Funcionario entidade) {
		service.inativar(entidade);
	}

	public Funcionario buscaPorId(Long id) {
		return service.buscaPorId(id);
	}

	public List<Funcionario> listarTudo() {
		return dao.listarTudo();
	}

}
