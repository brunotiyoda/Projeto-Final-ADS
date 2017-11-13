package br.com.projetofinal.tx;

import java.io.Serializable;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import javax.persistence.EntityManager;

@SuppressWarnings("serial")
@Transacional
@Interceptor
public class GerenciaDeTransacao implements Serializable {

	@Inject
	EntityManager entityManager;

	@AroundInvoke
	public Object executaTX(InvocationContext context) throws Exception {

		entityManager.getTransaction().begin();
		System.out.println("Iniciando Transacao");

		Object resultado = context.proceed();

		entityManager.getTransaction().commit();
		System.out.println("COMMITADO");

		return resultado;
	}

}
