package br.com.projetofinal.controller;

import br.com.projetofinal.architecture.controller.GenericController;
import br.com.projetofinal.architecture.service.GenericService;
import br.com.projetofinal.model.RegistrarPonto;
import br.com.projetofinal.service.RegistrarPontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registrarponto")
public class RegistrarPontoController extends GenericController<RegistrarPonto> {

	@Autowired
	private RegistrarPontoService registrarPontoService;

	@Override
	public GenericService<RegistrarPonto> getGenericService() {
		return registrarPontoService;
	}
}
