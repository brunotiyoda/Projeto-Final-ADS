package br.com.projetofinal.controller;

import br.com.projetofinal.architecture.controller.GenericController;
import br.com.projetofinal.architecture.service.GenericService;
import br.com.projetofinal.model.Departamento;
import br.com.projetofinal.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/departamento")
public class DepartamentoController extends GenericController<Departamento> {

	@Autowired
	private DepartamentoService departamentoService;

	@Override
	public GenericService<Departamento> getGenericService() {
		return departamentoService;
	}
}
