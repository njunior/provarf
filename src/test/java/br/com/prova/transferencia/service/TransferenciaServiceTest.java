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

public class TransferenciaServiceTest {

	TransferenciaDAO transferenciaDAO;
	TransferenciaService transferenciaService;

	@Before
	public void setUp() {
		transferenciaDAO = Mockito.mock(TransferenciaDAOImpl.class);
		transferenciaService = new TransferenciaServiceImpl(transferenciaDAO);
	}

	@Test
	public void deveAgendarTransferencia() {
		Transferencia transferencia = new Transferencia();

		transferencia.setContaDestino("12344-4");
		transferencia.setContaOrigem("12345-5");
		transferencia.setDataAgendamento(Calendar.getInstance());
		transferencia.setValor(12000.00);
		transferencia.setTipoOperacao(TipoOperacao.TIPO_A);

		when(transferenciaDAO.save(transferencia)).thenReturn(transferencia);
		Transferencia transferenciaAgendada = transferenciaService.agendarTransferencia(transferencia);

		Assert.assertEquals(transferenciaAgendada.getValor(), 12000.00, 0);
		Assert.assertEquals(transferenciaAgendada.getTaxa(), 362.00, 0);
	}

	@Test
	public void deveBuscarTransferenciasAgendadas() {
		when(transferenciaDAO.findAll()).thenReturn(criaListaDeTransferencias());
		List<Transferencia> transferenciasAgendadas = transferenciaService.buscarTransferenciasAgendadas();

		Assert.assertEquals(transferenciasAgendadas.size(), 5);
	}
	
	@Test
	public void deveBuscarTransferenciasAgendadasPorConta() {
		when(transferenciaDAO.findByTransferenciasAgendadasPorConta("12344-5")).thenReturn(criaListaDeTransferenciasPorContaOrigem());
		List<Transferencia> transferenciasAgendadas = transferenciaService.buscarTransferenciasAgendadasPorConta("12344-5");

		Assert.assertEquals(transferenciasAgendadas.size(), 3);
	}
	
	public List<Transferencia> criaListaDeTransferencias() {
		List<Transferencia> transferencias = new ArrayList<Transferencia>();
		for(int i = 1;i < 6;i++){
		    Transferencia transferencia = new Transferencia();
			transferencia.setContaDestino("12344-"+ i);
			transferencia.setContaOrigem("12345-" + (i+1));
			transferencia.setDataAgendamento(Calendar.getInstance());
			transferencia.setValor(12000.00);
			transferencia.setTipoOperacao(TipoOperacao.TIPO_A);
			transferencias.add(transferencia);
		}
		return transferencias;
	}	
	
	public List<Transferencia> criaListaDeTransferenciasPorContaOrigem() {
		List<Transferencia> transferencias = new ArrayList<Transferencia>();
		for(int i = 1;i < 4;i++){
		    Transferencia transferencia = new Transferencia();
			transferencia.setContaOrigem("12344-5");
			transferencia.setContaDestino("12345-" + (i+1));
			transferencia.setDataAgendamento(Calendar.getInstance());
			transferencia.setValor(15000.00);
			transferencia.setTipoOperacao(TipoOperacao.TIPO_A);
			transferencias.add(transferencia);
		}
		return transferencias;
	}	
}
