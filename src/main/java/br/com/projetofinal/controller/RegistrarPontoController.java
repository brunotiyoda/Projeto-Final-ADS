package br.com.projetofinal.controller;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

import org.primefaces.event.ScheduleEntryMoveEvent;
import org.primefaces.event.ScheduleEntryResizeEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.DefaultScheduleEvent;
import org.primefaces.model.DefaultScheduleModel;
import org.primefaces.model.ScheduleEvent;
import org.primefaces.model.ScheduleModel;

import br.com.projetofinal.model.Funcionario;
import br.com.projetofinal.model.RegistrarPonto;
import br.com.projetofinal.service.FuncionarioService;
import br.com.projetofinal.service.RegistrarPontoService;
import br.com.projetofinal.tx.Transacional;

@SuppressWarnings("serial")
@Model
public class RegistrarPontoController implements Serializable {

	@Inject
	private RegistrarPontoService registrarPontoService;

	@Inject
	private FuncionarioService funcionarioService;

	private ScheduleModel eventModel;
	private ScheduleEvent event = new DefaultScheduleEvent();

	private RegistrarPonto ponto = new RegistrarPonto();
	private Funcionario funcionario = new Funcionario();

	private Long funcionarioId;

	public ScheduleModel getEventModel() {
		return eventModel;
	}

	public ScheduleEvent getEvent() {
		return event;
	}

	public RegistrarPonto getPonto() {
		return ponto;
	}

	public void setPonto(RegistrarPonto ponto) {
		this.ponto = ponto;
	}

	public Long getFuncionarioId() {
		return funcionarioId;
	}

	public void setFuncionarioId(Long funcionarioId) {
		this.funcionarioId = funcionarioId;
	}

	@PostConstruct
	public void init() {
		eventModel = new DefaultScheduleModel();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	}

	@Transacional
	public void salvar() {
		funcionario = funcionarioService.buscaPorId(funcionarioId);

		ponto.setFuncionario(funcionario);

		System.out.println(ponto.getDia());
		/*
		 * System.out.println(ponto.getEntrada()); System.out.println(ponto.getSaida());
		 */		
		System.out.println(ponto.getFuncionario().getNome());
		System.out.println(ponto.isJustificarDia());
		
		registrarPontoService.salvar(ponto);
	}

	public void addEvent(ActionEvent actionEvent) {
		if (event.getId() == null)
			eventModel.addEvent(event);
		else
			eventModel.updateEvent(event);

		event = new DefaultScheduleEvent();
	}

	/** listas **/
	public List<Funcionario> getListaFuncionarios() {
		return funcionarioService.listarTudo();
	}

	// eventos
	public Date getDataAleatoria(Date base) {
		Calendar date = Calendar.getInstance();
		date.setTime(base);
		date.add(Calendar.DATE, ((int) (Math.random() * 30)) + 1); // set random day of month

		return date.getTime();
	}

	public Date getInitialDate() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(calendar.get(Calendar.YEAR), Calendar.FEBRUARY, calendar.get(Calendar.DATE), 0, 0, 0);

		return calendar.getTime();
	}

	private Calendar getHoje() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), 0, 0, 0);

		return calendar;
	}
	
	public void onEventSelect(SelectEvent selectEvent) {
		event = (ScheduleEvent) selectEvent.getObject();
	}

	public void onDateSelect(SelectEvent selectEvent) {
		event = new DefaultScheduleEvent("", (Date) selectEvent.getObject(), (Date) selectEvent.getObject());
	}

	public void onEventMove(ScheduleEntryMoveEvent event) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Event moved",
				"Day delta:" + event.getDayDelta() + ", Minute delta:" + event.getMinuteDelta());

		addMessage(message);
	}

	public void onEventResize(ScheduleEntryResizeEvent event) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Event resized",
				"Day delta:" + event.getDayDelta() + ", Minute delta:" + event.getMinuteDelta());

		addMessage(message);
	}

	private void addMessage(FacesMessage message) {
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

}
