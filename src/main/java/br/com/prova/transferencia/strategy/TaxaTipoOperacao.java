package br.com.prova.transferencia.strategy;

import java.util.Calendar;

public interface TaxaTipoOperacao {
	public double calcularTaxa(double valor, Calendar dataAgendamento);	
}
