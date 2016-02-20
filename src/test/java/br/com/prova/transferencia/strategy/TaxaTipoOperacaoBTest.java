package br.com.prova.transferencia.strategy;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;

import br.com.prova.transferencia.strategy.impl.TaxaTipoOperacaoB;

public class TaxaTipoOperacaoBTest {
	
	@Test
	public void deveriaCalcularTaxaTransferenciaTipoBAteTrintaDias(){
		Calendar dataAgendamento = Calendar.getInstance();
		dataAgendamento.add(Calendar.DAY_OF_MONTH, 30);
		
        TaxaTipoOperacao tipoOperacaoB = new TaxaTipoOperacaoB();		
		double taxa = tipoOperacaoB.calcularTaxa(100.0, dataAgendamento);
		
		assertEquals("Taxa Tipo Operacao B",10.0, taxa, 0.0);			
	}
	
	@Test
	public void deveriaCalcularTaxaTransferenciaTipoBMaiorQueTrintaDias(){
		Calendar dataAgendamento = Calendar.getInstance();
		dataAgendamento.set(2016, 8, 10);
		
		TaxaTipoOperacao tipoOperacaoB = new TaxaTipoOperacaoB();		
		double taxa = tipoOperacaoB.calcularTaxa(100.0, dataAgendamento);
				
		assertEquals("Taxa Tipo Operacao B",8.0, taxa, 0.01);		
	}
}
