package br.com.prova.transferencia.strategy;

import java.util.Calendar;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import br.com.prova.transferencia.strategy.ContextTaxaTipoOperacao;
import br.com.prova.transferencia.strategy.TaxaTipoOperacaoA;

public class TaxaTipoOperacaoATest {
	
	@Test
	public void deveriaCalcularTaxaTransferenciaTipoA(){
		Calendar dataAgendamento = Calendar.getInstance();
		
		ContextTaxaTipoOperacao context = new ContextTaxaTipoOperacao(100.0, dataAgendamento, new TaxaTipoOperacaoA());
		double taxa = context.getResult();

		assertEquals("Taxa Tipo Operacao A",5.0, taxa, 0.0);
			
	}
}
