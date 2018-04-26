package br.com.projetofinal.dao;

import br.com.projetofinal.architecture.dao.GenericDAO;
import br.com.projetofinal.model.RegistrarPonto;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;

@Repository
public class RegistarPontoDAO extends GenericDAO<RegistrarPonto> {

    public RegistrarPonto buscaPorHorasDoFuncionario(Long idFuncionario) {
        TypedQuery<RegistrarPonto> query = getEntityManager().createQuery(
                "SELECT CONVERT (VARCHAR, SUM (CONVERT (INT, LEFT (HORA, 2))) + (((SUM (CONVERT (INT, RIGHT (HORA, 2)))) - (SUM (CONVERT (INT, RIGHT (HORA, 2))) % 60)) / 60)) + ':' +  CONVERT (VARCHAR, SUM (CONVERT (INT, RIGHT (HORA, 2))) % 60) \r\n"
                        + "FROM registrarponto WHERE funcionario_id in :idF",
                RegistrarPonto.class);
        query.setParameter("idF", idFuncionario);

        RegistrarPonto ponto = (RegistrarPonto) query.getResultList();

        return ponto;
    }

}
