package br.com.projetofinal.service;

import java.util.List;

import javax.inject.Inject;

import br.com.projetofinal.dao.DepartamentoDAO;
import br.com.projetofinal.model.Departamento;

public class DepartamentoService {

	@Inject
	private DepartamentoDAO dao;

	private GenericService<Departamento> service;

	public void salvar(Departamento entidade) {
		dao.salvar(entidade);
	}

	public void editar(Departamento entidade) {
		dao.editar(entidade);
	}

	public void ativar(Departamento entidade) {
		dao.ativar(entidade);
	}

	public void inativar(Departamento entidade) {
		dao.inativar(entidade);
	}

	public Departamento buscaPorId(Long id) {
		return dao.buscaPorId(id);
	}

	public List<Departamento> listarTudo() {
		return dao.listarTudo();
	}

}
