package br.com.projetofinal.service;

import java.util.List;

import javax.inject.Inject;

import br.com.projetofinal.architecture.service.GenericService;
import br.com.projetofinal.dao.CargoDAO;
import br.com.projetofinal.model.Cargo;

public class CargoService extends GenericService<Cargo> {

	@Inject
	private CargoDAO dao;

	public void salvar(Cargo entidade) {
		dao.salvar(entidade);
	}

	public void editar(Cargo entidade) {
		dao.editar(entidade);
	}

	public Cargo buscaPorId(Long id) {
		return dao.buscaPorId(id);
	}

	public List<Cargo> listarTudo() {
		return dao.listarTudo();
	}

}
