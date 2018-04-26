package br.com.projetofinal.controller;

import br.com.projetofinal.architecture.controller.GenericController;
import br.com.projetofinal.architecture.service.GenericService;
import br.com.projetofinal.model.Cargo;
import br.com.projetofinal.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/cargo")
public class CargoController extends GenericController<Cargo> {

	@Autowired
	private CargoService cargoService;

	@Override
	public GenericService<Cargo> getGenericService() {
		return cargoService;
	}
}
