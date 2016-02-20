package br.com.prova.transferencia.service;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import br.com.prova.transferencia.dao.TransferenciaDAO;
import br.com.prova.transferencia.dao.impl.TransferenciaDAOImpl;
import br.com.prova.transferencia.enums.TipoOperacao;
import br.com.prova.transferencia.model.Transferencia;
import br.com.prova.transferencia.service.impl.TransferenciaServiceImpl;
import br.com.prova.transferencia.strategy.ContextTaxaTipoOperacao;
import br.com.prova.transferencia.strategy.TaxaTipoOperacaoA;

public class TransferenciaServiceTest {
		
	TransferenciaDAO transferenciaDAO;	
	TransferenciaService transferenciaService;
	
	@Before
    public void setUp() {
        transferenciaDAO = Mockito.mock(TransferenciaDAOImpl.class);
        transferenciaService = new TransferenciaServiceImpl(transferenciaDAO);
    }

	@Test
	public void deveAgendarTransferencia(){		
		Transferencia transferencia = new Transferencia();	
		transferencia.setContaDestino("12344-4");
		transferencia.setContaOrigem("12345-5");
		transferencia.setDataAgendamento(Calendar.getInstance());
		transferencia.setValor(12000.00);
		transferencia.setTipoOperacao(TipoOperacao.TIPO_A);
		ContextTaxaTipoOperacao contextTaxa = new ContextTaxaTipoOperacao(transferencia.getValor(), transferencia.getDataAgendamento(),new TaxaTipoOperacaoA());
		transferencia.setTaxa(contextTaxa.getResult());
		
		when(transferenciaDAO.save(transferencia)).thenReturn(transferencia);		
		Transferencia transferenciaAgendada = transferenciaService.agendarTransferencia(transferencia);
				
		Assert.assertEquals(transferenciaAgendada.getValor(), 12000.00, 0);
		Assert.assertEquals(transferenciaAgendada.getTaxa(), 362.00, 0);		
	}
	
	@Test
	//teste
	public void deveBuscarTransferenciasAgendadas(){
		List<Transferencia> transferencias = new ArrayList<Transferencia>();
		//transferencias.add(e)
		when(transferenciaDAO.findAll()).thenReturn(transferencias);			
	}

}
