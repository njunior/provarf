package br.com.prova.transferencia.strategy.impl;

import java.util.Calendar;

import br.com.prova.transferencia.strategy.TaxaTipoOperacao;

public class TaxaTipoOperacaoC implements TaxaTipoOperacao {
	
	public double calcularTaxa(double valor, Calendar dataAgendamento) {
		Calendar dataAtual = Calendar.getInstance();
		int intervaloEmDias = (int) ((dataAgendamento.getTime().getTime() - dataAtual.getTime().getTime()) / (1000 * 60 * 60 * 24));

		if (intervaloEmDias <= 5){
			return valor * 0.083;
		}else if (intervaloEmDias <= 10){
			return valor * 0.074;
		}else if (intervaloEmDias <= 15){
			return valor * 0.067;
		}else if (intervaloEmDias <= 20){
			return valor * 0.054;
		}else if (intervaloEmDias <= 25){
			return valor * 0.043;
		}else if (intervaloEmDias <= 30){
			return valor * 0.021;
		}
		
		return valor * 0.012;
	}
}
