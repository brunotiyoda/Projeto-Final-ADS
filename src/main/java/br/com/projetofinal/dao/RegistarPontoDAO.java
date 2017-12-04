package br.com.projetofinal.dao;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.projetofinal.architecture.dao.GenericDAO;
import br.com.projetofinal.model.RegistrarPonto;

@SuppressWarnings("serial")
public class RegistarPontoDAO implements Serializable {

	@Inject
	private EntityManager entityManager;

	private GenericDAO<RegistrarPonto> dao;

	public void salvar(RegistrarPonto entidade) {
		dao.salvar(entidade);
	}

	public RegistrarPonto buscaPorId(Long id) {
		return dao.buscaPorId(id);
	}

	public RegistrarPonto buscaPorHorasDoFuncionario(Long idFuncionario) {
		TypedQuery<RegistrarPonto> query = entityManager.createQuery(
				"SELECT CONVERT (VARCHAR, SUM (CONVERT (INT, LEFT (HORA, 2))) + (((SUM (CONVERT (INT, RIGHT (HORA, 2)))) - (SUM (CONVERT (INT, RIGHT (HORA, 2))) % 60)) / 60)) + ':' +  CONVERT (VARCHAR, SUM (CONVERT (INT, RIGHT (HORA, 2))) % 60) \r\n"
						+ "FROM registrarponto WHERE funcionario_id in :idF",
				RegistrarPonto.class);
		query.setParameter("idF", idFuncionario);
		
		RegistrarPonto ponto = (RegistrarPonto) query.getResultList();
		
		return ponto;
	}

}
