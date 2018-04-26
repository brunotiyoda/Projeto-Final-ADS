package br.com.projetofinal.controller;

import br.com.projetofinal.architecture.controller.GenericController;
import br.com.projetofinal.architecture.service.GenericService;
import br.com.projetofinal.model.Empresa;
import br.com.projetofinal.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/empresa")
public class EmpresaController extends GenericController<Empresa> {

	@Autowired
	private EmpresaService empresaService;

	@Override
	public GenericService<Empresa> getGenericService() {
		return empresaService;
	}
}
