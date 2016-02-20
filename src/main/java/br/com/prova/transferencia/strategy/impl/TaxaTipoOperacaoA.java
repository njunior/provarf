package br.com.prova.transferencia.strategy.impl;

import java.util.Calendar;

import br.com.prova.transferencia.strategy.TaxaTipoOperacao;

public class TaxaTipoOperacaoA implements TaxaTipoOperacao {
	
	public double calcularTaxa(double valor, Calendar dataAgendamento) {
		return (valor*0.03) + 2;
	}

}
