package br.com.projetofinal.dao;

import br.com.projetofinal.architecture.dao.GenericDAO;
import br.com.projetofinal.model.Funcionario;

import javax.persistence.TypedQuery;
import java.util.List;

public class FuncionarioDAO extends GenericDAO<Funcionario> {

    public boolean buscaLogin(Funcionario funcionario) {

        TypedQuery<Funcionario> query = getEntityManager().createQuery("SELECT f FROM Funcionario f WHERE f.cpf = :pCpf AND f.senha = :pSenha", Funcionario.class);
        query.setParameter("pCpf", funcionario.getCpf());
        query.setParameter("pSenha", funcionario.getSenha());

        Funcionario resultado = query.getSingleResult();

        return resultado != null;
    }

    public List<Funcionario> listarTudo() {
        String jpql;
        jpql = "SELECT f FROM Funcionario f ORDER BY f.nome";
        return getEntityManager().createQuery(jpql, Funcionario.class).getResultList();
    }

}
