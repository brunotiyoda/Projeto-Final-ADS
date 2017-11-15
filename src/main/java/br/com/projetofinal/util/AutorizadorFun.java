package br.com.projetofinal.util;

import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import br.com.projetofinal.model.Funcionario;

/*
 * @author Bruno Yudi Tiyoda
 * Garante o acesso do usuário. Caso não tenha nenhum usuário, volta para login.xhtml
 * */
@SuppressWarnings("serial")
public class AutorizadorFun implements PhaseListener {

	@Override
	public void afterPhase(PhaseEvent evento) {

		FacesContext context = evento.getFacesContext();
		String nomePagina = context.getViewRoot().getViewId();

		System.out.println(nomePagina);

		if ("/index.xhtml".equals(nomePagina)) {
			return;
		}

		Funcionario colaboradorLogado = (Funcionario) context.getExternalContext().getSessionMap().get("colaboradorLogado");

		if (colaboradorLogado != null) {
			return;
		}

		// redirecionamento para login.xhtml
		NavigationHandler handler = context.getApplication().getNavigationHandler();
		handler.handleNavigation(context, null, "/index?faces-redirect=true");
		context.renderResponse();
	}

	public void beforePhase(PhaseEvent event) {
	}

	public PhaseId getPhaseId() {
		return PhaseId.RESTORE_VIEW;
	}

}
