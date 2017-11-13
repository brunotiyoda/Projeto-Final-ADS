package br.com.projetofinal.service;

import java.util.List;

import br.com.projetofinal.dao.EmpresaDAO;
import br.com.projetofinal.model.Empresa;

public class EmpresaService {

	private EmpresaDAO dao;

	private GenericService<Empresa> service;

	public void salvar(Empresa entidade) {
		service.salvar(entidade);
	}

	public void editar(Empresa entidade) {
		service.editar(entidade);
	}

	public void ativar(Empresa entidade) {
		service.ativar(entidade);
	}

	public void inativar(Empresa entidade) {
		service.inativar(entidade);
	}

	public Empresa buscaPorId(Long id) {
		return service.buscaPorId(id);
	}

	public List<Empresa> listarTudo() {
		return dao.listarTudo();
	}

}
