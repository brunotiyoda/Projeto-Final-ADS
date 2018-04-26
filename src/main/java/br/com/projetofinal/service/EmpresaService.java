package br.com.projetofinal.service;

import br.com.projetofinal.architecture.dao.GenericDAO;
import br.com.projetofinal.architecture.service.GenericService;
import br.com.projetofinal.dao.EmpresaDAO;
import br.com.projetofinal.model.Empresa;
import org.springframework.beans.factory.annotation.Autowired;

public class EmpresaService extends GenericService<Empresa> {

	@Autowired
	private EmpresaDAO empresaDAO;

	@Override
	public GenericDAO<Empresa> getGenericDAO() {
		return empresaDAO;
	}
}
