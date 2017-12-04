package br.com.projetofinal.service;

import java.sql.Date;

import javax.inject.Inject;

import br.com.projetofinal.architecture.service.GenericService;
import br.com.projetofinal.dao.RegistarPontoDAO;
import br.com.projetofinal.model.Funcionario;
import br.com.projetofinal.model.RegistrarPonto;

public class RegistrarPontoService extends GenericService<RegistrarPonto> {

	@Inject
	private RegistarPontoDAO dao;

	public void salvar(RegistrarPonto entidade) {
		dao.salvar(entidade);
	}

	public Date parseUtilToSQLDate(java.util.Date date) {
		return new Date(date.getTime());
	}

	public RegistrarPonto buscaPorHorasDoFuncionario(Long idFuncionario) {
		return dao.buscaPorHorasDoFuncionario(idFuncionario);
	}

}
