/*
package br.com.projetofinal.controller.login;

import java.io.Serializable;

import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import br.com.projetofinal.dao.EmpresaDAO;
import br.com.projetofinal.model.Empresa;

@SuppressWarnings("serial")
@Model
public class EmpresaControllerLogin implements Serializable {

	@Inject
	private EmpresaDAO empresaDAO;

	public String logar() {
		// captura qual usuário está fazendo login
		System.out.println("Fazendo login do usuário " + this.empresa.getCnpj());
		boolean existe = empresaDAO.buscaLogin(this.empresa);

		if (existe) {
			context.getExternalContext().getSessionMap().put("usuarioLogado", this.empresa);
			return "/empresa/emp-principal?faces-redirect=true";
		}

		context.getExternalContext().getFlash().setKeepMessages(true);
		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário não encontrado!", null));
		return "index";
	}

	public String deslogar() {
		context.getExternalContext().getSessionMap().remove("usuarioLogado");
		return "../index?faces-redirect=true";
	}
}
*/
