package br.com.projetofinal.architecture.chain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.inject.Inject;

import br.com.projetofinal.model.Funcionario;
import br.com.projetofinal.model.RegistrarPonto;
import br.com.projetofinal.service.FuncionarioService;
import br.com.projetofinal.service.RegistrarPontoService;

@SuppressWarnings("serial")
public class Pagamento implements Serializable {

	@Inject
	private RegistrarPontoService pontoService;

	@Inject
	private FuncionarioService funcionarioService;

	public BigDecimal gerarFolha(RegistrarPonto registrarPonto, Funcionario funcionario) {

		RegistrarPonto idRegistrarPonto = pontoService.buscaPorId(registrarPonto.getId());
		RegistrarPonto totalHoras = pontoService.buscaPorHorasDoFuncionario(funcionario.getId());
		
		BigDecimal salarioSemDesconto = funcionario.getSalario();
		BigDecimal salarioHora = salarioSemDesconto.divide(salarioSemDesconto, 220);
		BigDecimal salarioHoraExtra = salarioHora.multiply(new BigDecimal("0.5"));
		
		BigDecimal salarioTotal = salarioSemDesconto;
		
		
		return salarioTotal;
	}

}
