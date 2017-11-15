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
		dao.salvar(entidade);
	}

	public void editar(Funcionario entidade) {
		dao.editar(entidade);
	}

	public void ativar(Funcionario entidade) {
		dao.ativar(entidade);
	}

	public void inativar(Funcionario entidade) {
		dao.inativar(entidade);
	}

	public Funcionario buscaPorId(Long id) {
		return dao.buscaPorId(id);
	}

	public List<Funcionario> listarTudo() {
		return dao.listarTudo();
	}

}
