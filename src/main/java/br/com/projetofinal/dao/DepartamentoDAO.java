package br.com.projetofinal.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.projetofinal.architecture.dao.GenericDAO;
import br.com.projetofinal.model.Departamento;

@SuppressWarnings("serial")
public class DepartamentoDAO implements Serializable {

	@Inject
	private EntityManager entityManager;

	private GenericDAO<Departamento> dao;

	@PostConstruct
	public void init() {
		this.dao = new GenericDAO<Departamento>(this.entityManager, Departamento.class);
	}

	public void salvar(Departamento entidade) {
		dao.salvar(entidade);
	}

	public void editar(Departamento entidade) {
		dao.editar(entidade);
	}

	public void ativar(Departamento entidade) {
		dao.ativar(entidade);
	}

	public void inativar(Departamento entidade) {
		dao.inativar(entidade);
	}

	public Departamento buscaPorId(Long id) {
		return dao.buscaPorId(id);
	}

	public List<Departamento> listarTudo() {
		String jpql;
		jpql = "SELECT d FROM Departamento d ORDER BY d.departamento";
		return entityManager.createQuery(jpql, Departamento.class).getResultList();
	}

}
