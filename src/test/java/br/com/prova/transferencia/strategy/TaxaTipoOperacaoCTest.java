package br.com.prova.transferencia.strategy;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;

import br.com.prova.transferencia.strategy.ContextTaxaTipoOperacao;
import br.com.prova.transferencia.strategy.TaxaTipoOperacaoC;

public class TaxaTipoOperacaoCTest {
	@Test
	public void deveriaCalcularTaxaTransferenciaTipoCMaiorQueTrintaDias(){
	
	}
	
	@Test
	public void deveriaCalcularTaxaTransferenciaTipoCAteTrintaDias(){
		Calendar dataAgendamento = Calendar.getInstance();
		dataAgendamento.add(Calendar.DAY_OF_MONTH, 29);		
		
		ContextTaxaTipoOperacao context = new ContextTaxaTipoOperacao(110.0, dataAgendamento, new TaxaTipoOperacaoC());
		double taxa = context.getResult();

		assertEquals("Taxa Tipo Operacao C",2.31, taxa, 0.0);
	}
	
	@Test
	public void deveriaCalcularTaxaTransferenciaTipoCAteVinteCincoDias(){
		Calendar dataAgendamento = Calendar.getInstance();
		dataAgendamento.add(Calendar.DAY_OF_MONTH, 25);	
	
		ContextTaxaTipoOperacao context = new ContextTaxaTipoOperacao(200.0, dataAgendamento, new TaxaTipoOperacaoC());
		double taxa = context.getResult();

		assertEquals("Taxa Tipo Operacao C",8.6, taxa, 0);
		
	}
		
	@Test
	public void deveriaCalcularTaxaTransferenciaTipoCAteVinteDias(){
		Calendar dataAgendamento = Calendar.getInstance();
		dataAgendamento.add(Calendar.DAY_OF_MONTH, 20);	
	
		ContextTaxaTipoOperacao context = new ContextTaxaTipoOperacao(200.0, dataAgendamento, new TaxaTipoOperacaoC());
		double taxa = context.getResult();

		assertEquals("Taxa Tipo Operacao C",10.8, taxa, 0);
		
	}
	
	@Test
	public void deveriaCalcularTaxaTransferenciaTipoCAteQuinzeDias(){
		Calendar dataAgendamento = Calendar.getInstance();
		dataAgendamento.add(Calendar.DAY_OF_MONTH, 15);	
	
		ContextTaxaTipoOperacao context = new ContextTaxaTipoOperacao(300.0, dataAgendamento, new TaxaTipoOperacaoC());
		double taxa = context.getResult();

		assertEquals("Taxa Tipo Operacao C",20.1, taxa, 0);		
	}
	
	@Test
	public void deveriaCalcularTaxaTransferenciaTipoCAteDezDias(){
		Calendar dataAgendamento = Calendar.getInstance();
		dataAgendamento.add(Calendar.DAY_OF_MONTH, 10);	
	
		ContextTaxaTipoOperacao context = new ContextTaxaTipoOperacao(300.0, dataAgendamento, new TaxaTipoOperacaoC());
		double taxa = context.getResult();

		assertEquals("Taxa Tipo Operacao C",22.2, taxa, 0);		
	}
	
	@Test
	public void deveriaAgendarTransferenciaTipoCAte5Dias(){
		
	}
	
	//this.dataAgendamento.add(Calendar.DAY_OF_MONTH, 40);
}
