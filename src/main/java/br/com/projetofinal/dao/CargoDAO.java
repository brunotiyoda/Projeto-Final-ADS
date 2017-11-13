package br.com.projetofinal.dao;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.projetofinal.model.Cargo;

@SuppressWarnings("serial")
public class CargoDAO implements Serializable {

	@Inject
	private EntityManager entityManager;

	private GenericDAO<Cargo> dao;

	@PostConstruct
	public void init() {
		this.dao = new GenericDAO<Cargo>(this.entityManager, Cargo.class);
	}

	public void salvar(Cargo entidade) {
		dao.salvar(entidade);
	}

	public void editar(Cargo entidade) {
		dao.editar(entidade);
	}

	public void ativar(Cargo entidade) {
		dao.ativar(entidade);
	}

	public void inativar(Cargo entidade) {
		dao.inativar(entidade);
	}

	public Cargo buscaPorId(Long id) {
		TypedQuery<Cargo> query = entityManager.createQuery("SELECT c FROM Cargo c WHERE c.id = :id", Cargo.class);
		return query.setParameter("id", id).getSingleResult();
	}

}
