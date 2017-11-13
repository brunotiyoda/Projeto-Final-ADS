package br.com.projetofinal.util;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

@SuppressWarnings("serial")
public class LogPhaseListener implements PhaseListener {

	public void afterPhase(PhaseEvent arg0) {
	}

	public void beforePhase(PhaseEvent event) {
		System.out.println("FASE: " + event.getPhaseId());
	}

	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}
