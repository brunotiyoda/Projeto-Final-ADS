package br.com.projetofinal.architecture.dao;

import br.com.projetofinal.architecture.model.GenericModel;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

@Repository
public class GenericDAO<Entidade extends GenericModel> {

	private Class<Entidade> entidade;

	@PersistenceContext
	private EntityManager entityManager;

	public GenericDAO() {
		Type genericSuperClass = getClass().getGenericSuperclass();

		if (genericSuperClass != null && !(genericSuperClass instanceof Class)) {
			this.entidade = (Class<Entidade>) ((ParameterizedType) genericSuperClass).getActualTypeArguments()[0];
		}
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void salvar(Entidade entidade) {
		entityManager.persist(entidade);
	}

	public void editar(Entidade entidade) {
		entityManager.merge(entidade);
	}

	public void ativar(Entidade entidade) {
		entityManager.merge(entidade);
	}

	public void inativar(Entidade entidade) {
		entityManager.merge(entidade);
	}

	public void remover(Entidade entidade) {
		entityManager.remove(entityManager.merge(entidade));
	}

	public Entidade buscaPorId(String id) {
		return entityManager.find(this.entidade, id);
	}

	public List<Entidade> listaTodos() {
		CriteriaQuery<Entidade> query = entityManager.getCriteriaBuilder().createQuery(entidade);
		query.select(query.from(entidade));

		List<Entidade> lista = entityManager.createQuery(query).getResultList();

		return lista;
	}

}
