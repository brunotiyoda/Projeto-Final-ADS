package br.com.projetofinal.util;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("projfinal");

	@Produces
	@RequestScoped
	public EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}

	public void close(@Disposes EntityManager em) {
		System.out.println("FECHANDO TRANSACAO");
		em.close();
		System.out.println("FECHADO!");
	}
}
