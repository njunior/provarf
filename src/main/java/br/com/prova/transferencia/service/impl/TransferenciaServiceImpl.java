package br.com.prova.transferencia.service.impl;

import java.util.Calendar;
import java.util.List;

import br.com.prova.transferencia.dao.TransferenciaDAO;
import br.com.prova.transferencia.model.Transferencia;
import br.com.prova.transferencia.service.TransferenciaService;
import br.com.prova.transferencia.strategy.TaxaTipoOperacao;

public class TransferenciaServiceImpl implements TransferenciaService{
	//Será utilizado Injeção de Dependência
	TransferenciaDAO transferenciaDAO;
	
	public TransferenciaServiceImpl(TransferenciaDAO transferenciaDAO) {
		this.transferenciaDAO = transferenciaDAO;
	}

	public Transferencia agendarTransferencia(Transferencia transferencia){
		double taxa = calcularTaxa(transferencia.getValor(), transferencia.getDataAgendamento(), transferencia.getTipoOperacao().taxaTipoOperacao()); 
		transferencia.setTaxa(taxa);
		
		return transferenciaDAO.save(transferencia);
	}
	
	public List<Transferencia> buscarTransferenciasAgendadas(){
		return transferenciaDAO.findAll();
	};
	
	public List<Transferencia> buscarTransferenciasAgendadasPorConta(String conta){
		return transferenciaDAO.findByTransferenciasAgendadasPorConta(conta);
	};	
	
	private double calcularTaxa(double valor, Calendar dataAgendamento, TaxaTipoOperacao taxaTipoOperacao) {
		return taxaTipoOperacao.calcularTaxa(valor, dataAgendamento);
	}
}
