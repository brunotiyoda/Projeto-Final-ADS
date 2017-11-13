package br.com.projetofinal.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

import br.com.projetofinal.model.Empresa;

@SuppressWarnings("serial")
public class EmpresaDAO implements Serializable {

	private EntityManager entityManager;

	private GenericDAO<Empresa> dao;

	@PostConstruct
	public void init() {
		this.dao = new GenericDAO<Empresa>(this.entityManager, Empresa.class);
	}

	public void salvar(Empresa entidade) {
		dao.salvar(entidade);
	}

	public void editar(Empresa entidade) {
		dao.editar(entidade);
	}

	public void ativar(Empresa entidade) {
		dao.ativar(entidade);
	}

	public void inativar(Empresa entidade) {
		dao.inativar(entidade);
	}

	public Empresa buscaPorId(Long id) {
		return dao.buscaPorId(id);
	}

	public List<Empresa> listarTudo() {
		String jpql;
		jpql = "SELECT e FROM Empresa e";
		return entityManager.createQuery(jpql, Empresa.class).getResultList();
	}

}
