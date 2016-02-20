package br.com.prova.transferencia.strategy;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;

import br.com.prova.transferencia.strategy.impl.TaxaTipoOperacaoA;

public class TaxaTipoOperacaoATest {
	
	@Test
	public void deveriaCalcularTaxaTransferenciaTipoA(){
		Calendar dataAgendamento = Calendar.getInstance();
		TaxaTipoOperacao tipoOperacaoA = new TaxaTipoOperacaoA();
		
		double taxa = tipoOperacaoA.calcularTaxa(100.0, dataAgendamento);

		assertEquals("Taxa Tipo Operacao A",5.0, taxa, 0.0);	
	}
}
