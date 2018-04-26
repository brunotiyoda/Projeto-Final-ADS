package br.com.projetofinal.service;

import br.com.projetofinal.architecture.dao.GenericDAO;
import br.com.projetofinal.architecture.service.GenericService;
import br.com.projetofinal.dao.RegistarPontoDAO;
import br.com.projetofinal.model.RegistrarPonto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RegistrarPontoService extends GenericService<RegistrarPonto> {

    @Autowired
    private RegistarPontoDAO registarPontoDAO;

    @Override
    public GenericDAO<RegistrarPonto> getGenericDAO() {
        return registarPontoDAO;
    }

    public Date parseUtilToSQLDate(Date date) {
        return new Date(date.getTime());
    }

    public RegistrarPonto buscaPorHorasDoFuncionario(Long idFuncionario) {
        return registarPontoDAO.buscaPorHorasDoFuncionario(idFuncionario);
    }

}
