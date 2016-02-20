package br.com.prova.transferencia.service;

import java.util.List;

import br.com.prova.transferencia.model.Transferencia;

public interface TransferenciaService {

	public Transferencia agendarTransferencia(Transferencia transferencia);
	
	public List<Transferencia> buscarTransferenciasAgendadas();
	
	public List<Transferencia> buscarTransferenciasAgendadasPorConta(String conta);
}
