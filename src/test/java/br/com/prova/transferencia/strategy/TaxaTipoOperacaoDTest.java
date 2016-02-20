package br.com.prova.transferencia.strategy;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;

import br.com.prova.transferencia.strategy.ContextTaxaTipoOperacao;
import br.com.prova.transferencia.strategy.TaxaTipoOperacaoD;

public class TaxaTipoOperacaoDTest {
	@Test
	public void deveriaAgendarTransferenciaTipoDAteQueVinteCincoMil(){
		Calendar dataAgendamento = Calendar.getInstance();
		dataAgendamento.add(Calendar.DAY_OF_MONTH, 29);		
		
		ContextTaxaTipoOperacao context = new ContextTaxaTipoOperacao(25000.00, dataAgendamento, new TaxaTipoOperacaoD());
		double taxa = context.getResult();

		assertEquals("Taxa Tipo Operacao D - Taxa A",752.00, taxa, 0);
	}
	
	@Test
	public void deveriaAgendarTransferenciaTipoDEntreVinteCincoMilECentoVinteMil(){
		Calendar dataAgendamento = Calendar.getInstance();
		dataAgendamento.add(Calendar.DAY_OF_MONTH, 29);		
		
		ContextTaxaTipoOperacao context = new ContextTaxaTipoOperacao(35000.00, dataAgendamento, new TaxaTipoOperacaoD());
		double taxa = context.getResult();

		assertEquals("Taxa Tipo Operacao D - Taxa B",10.00, taxa, 0);		
	}
	
	@Test
	public void deveriaAgendarTransferenciaTipoDMaiorQueCentoVinteMil(){
		Calendar dataAgendamento = Calendar.getInstance();
		dataAgendamento.add(Calendar.DAY_OF_MONTH, 29);		
		
		ContextTaxaTipoOperacao context = new ContextTaxaTipoOperacao(126000.00, dataAgendamento, new TaxaTipoOperacaoD());
		double taxa = context.getResult();

		assertEquals("Taxa Tipo Operacao D - Taxa C",2646.00, taxa, 0);
		
	}	
}
