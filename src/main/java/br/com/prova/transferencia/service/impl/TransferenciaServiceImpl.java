package br.com.prova.transferencia.service.impl;

import java.util.List;

import br.com.prova.transferencia.dao.TransferenciaDAO;
import br.com.prova.transferencia.dao.impl.TransferenciaDAOImpl;
import br.com.prova.transferencia.model.Transferencia;
import br.com.prova.transferencia.service.TransferenciaService;

public class TransferenciaServiceImpl implements TransferenciaService{
	TransferenciaDAO transferenciaDAO = new TransferenciaDAOImpl();
	
	public TransferenciaServiceImpl(TransferenciaDAO transferenciaDAO) {
		this.transferenciaDAO = transferenciaDAO;
	}

	public Transferencia agendarTransferencia(Transferencia transferencia){
		Transferencia transferenciaAgendada= transferenciaDAO.save(transferencia);
		return transferenciaAgendada;
	}
	
	public List<Transferencia> buscarTransferenciasAgendadas(){
		return transferenciaDAO.findAll();
	};
	
	public List<Transferencia> buscarTransferenciasAgendadasPorConta(String conta){
		return transferenciaDAO.findByTransferenciasAgendadasPorConta(conta);
	};	
}
