package br.com.projetofinal.controller;

import br.com.projetofinal.architecture.controller.GenericController;
import br.com.projetofinal.architecture.service.GenericService;
import br.com.projetofinal.model.Funcionario;
import br.com.projetofinal.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/funcionario")
public class FuncionarioController extends GenericController<Funcionario> {

	@Autowired
	private FuncionarioService funcionarioService;

	@Override
	public GenericService<Funcionario> getGenericService() {
		return funcionarioService;
	}
}
