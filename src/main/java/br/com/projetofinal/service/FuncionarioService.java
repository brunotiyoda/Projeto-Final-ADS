package br.com.projetofinal.service;

import br.com.projetofinal.architecture.dao.GenericDAO;
import br.com.projetofinal.architecture.service.GenericService;
import br.com.projetofinal.dao.FuncionarioDAO;
import br.com.projetofinal.model.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;

public class FuncionarioService extends GenericService<Funcionario> {

    @Autowired
    private FuncionarioDAO funcionarioDAO;

    @Override
    public GenericDAO<Funcionario> getGenericDAO() {
        return funcionarioDAO;
    }
}
