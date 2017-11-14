package br.com.projetofinal.controller;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.com.projetofinal.model.Cargo;
import br.com.projetofinal.service.CargoService;
import br.com.projetofinal.tx.Transacional;

@SuppressWarnings("serial")
@Model
public class CargoController implements Serializable {

	private GenericController<Cargo> controller;

	@Inject
	private CargoService service;

	private Cargo cargo = new Cargo();

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	@Transacional
	public void salvar(Cargo entidade) {
		controller.salvar(entidade);
	}

	public void editar(Cargo entidade) {
		controller.editar(entidade);
	}

	public void ativar(Cargo entidade) {
		controller.ativar(entidade);
	}

	public void inativar(Cargo entidade) {
		controller.inativar(entidade);
	}

	public Cargo buscaPorId(Long id) {
		return controller.buscaPorId(id);
	}

	public List<Cargo> listarTudo() {
		return service.listarTudo();
	}

}
