package br.com.prova.transferencia.strategy.impl;

import java.util.Calendar;

import br.com.prova.transferencia.strategy.TaxaTipoOperacao;

public class TaxaTipoOperacaoD implements TaxaTipoOperacao {

	public double calcularTaxa(double valor, Calendar dataAgendamento) {
		if(valor <= 25000){
			TaxaTipoOperacaoA tipoOperacaoA = new TaxaTipoOperacaoA();
			return tipoOperacaoA.calcularTaxa(valor, dataAgendamento);		
		}

		if ((valor > 25000) && (valor <= 120000)){
			TaxaTipoOperacaoB tipoOperacaoB = new TaxaTipoOperacaoB();
			return tipoOperacaoB.calcularTaxa(valor, dataAgendamento);	
		}
		
		if (valor > 120000){
			TaxaTipoOperacaoC tipoOperacaoC = new TaxaTipoOperacaoC();
			return tipoOperacaoC.calcularTaxa(valor, dataAgendamento);	
		}		
		
		return 0.0;
	}
}
