package br.com.projetofinal.service;

import br.com.projetofinal.architecture.dao.GenericDAO;
import br.com.projetofinal.architecture.service.GenericService;
import br.com.projetofinal.dao.DepartamentoDAO;
import br.com.projetofinal.model.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoService extends GenericService<Departamento> {

	@Autowired
	private DepartamentoDAO departamentoDAO;

	@Override
	public GenericDAO<Departamento> getGenericDAO() {
		return departamentoDAO;
	}
}
