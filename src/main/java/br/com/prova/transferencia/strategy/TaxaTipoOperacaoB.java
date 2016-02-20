package br.com.prova.transferencia.strategy;

import java.util.Calendar;

public class TaxaTipoOperacaoB implements TaxaTipoOperacao{
	
public double calcularTaxa(double valor, Calendar dataAgendamento) {		
		Calendar dataAtual = Calendar.getInstance();
		dataAtual.add(Calendar.DAY_OF_MONTH, 31);
		
		if(dataAgendamento.before(dataAtual)){
			return 10;
		}
		
		return 8;
	}
}
