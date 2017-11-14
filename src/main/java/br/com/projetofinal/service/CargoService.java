package br.com.projetofinal.service;

import java.util.List;

import javax.inject.Inject;

import br.com.projetofinal.dao.CargoDAO;
import br.com.projetofinal.model.Cargo;

public class CargoService {

	@Inject
	private CargoDAO dao;

	private GenericService<Cargo> service;

	public void salvar(Cargo entidade) {
		service.salvar(entidade);
	}

	public void editar(Cargo entidade) {
		service.editar(entidade);
	}

	public void ativar(Cargo entidade) {
		service.ativar(entidade);
	}

	public void inativar(Cargo entidade) {
		service.inativar(entidade);
	}

	public Cargo buscaPorId(Long id) {
		return service.buscaPorId(id);
	}

	public List<Cargo> listarTudo() {
		return dao.listarTudo();
	}

}
