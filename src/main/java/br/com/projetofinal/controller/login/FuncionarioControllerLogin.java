package br.com.projetofinal.controller.login;

import java.io.Serializable;

import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import br.com.projetofinal.dao.FuncionarioDAO;
import br.com.projetofinal.model.Funcionario;

@SuppressWarnings("serial")
@Model
public class FuncionarioControllerLogin implements Serializable {

	@Inject
	private FuncionarioDAO funcionarioDAO;

	@Inject
	private FacesContext context;

	private Funcionario funcionario = new Funcionario();

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public String logar() {
		// captura qual usuário está fazendo login
		System.out.println("Fazendo login do usuário " + this.funcionario.getCpf());
		boolean existe = funcionarioDAO.buscaLogin(this.funcionario);

		if (existe) {
			context.getExternalContext().getSessionMap().put("colaboradorLogado", this.funcionario);
			return "/colaborador/col-principal?faces-redirect=true";
		}

		context.getExternalContext().getFlash().setKeepMessages(true);
		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário não encontrado!", null));
		return "index";
	}

	public String deslogar() {
		context.getExternalContext().getSessionMap().remove("colaboradorLogado");
		return "../index?faces-redirect=true";
	}
	
	public String souColaborador() {
		return "sou-colaborador?faces-redirect=true";
	}
}
