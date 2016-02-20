package br.com.prova.transferencia.dao;

import java.util.List;

import br.com.prova.transferencia.model.Transferencia;

public interface TransferenciaDAO {
	public List<Transferencia> findAll();
	public List<Transferencia> findByTransferenciasAgendadasPorConta(String conta);
	public Transferencia save(Transferencia transferencia);
}
