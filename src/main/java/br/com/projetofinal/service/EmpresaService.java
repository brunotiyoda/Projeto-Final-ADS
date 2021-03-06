package br.com.projetofinal.service;

import java.util.List;

import javax.inject.Inject;

import br.com.projetofinal.architecture.service.GenericService;
import br.com.projetofinal.dao.EmpresaDAO;
import br.com.projetofinal.model.Empresa;

public class EmpresaService extends GenericService<Empresa> {

	@Inject
	private EmpresaDAO dao;

	public void salvar(Empresa entidade) {
		dao.salvar(entidade);
	}

	public void editar(Empresa entidade) {
		dao.editar(entidade);
	}

	public void ativar(Empresa entidade) {
		dao.ativar(entidade);
	}

	public void inativar(Empresa entidade) {
		dao.inativar(entidade);
	}

	public Empresa buscaPorId(Long id) {
		return dao.buscaPorId(id);
	}

	public List<Empresa> listarTudo() {
		return dao.listarTudo();
	}

}
