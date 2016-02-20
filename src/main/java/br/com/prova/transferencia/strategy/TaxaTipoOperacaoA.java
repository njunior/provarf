package br.com.prova.transferencia.strategy;

import java.util.Calendar;

public class TaxaTipoOperacaoA implements TaxaTipoOperacao {
	
	public double calcularTaxa(double valor, Calendar dataAgendamento) {
		return (valor*0.03) + 2;
	}

}
