package br.com.prova.transferencia.model;

import java.util.Calendar;

import br.com.prova.transferencia.enums.TipoOperacao;

public class Transferencia {
	
	private String contaOrigem;
	private String contaDestino;
	private double valor;
	private Calendar dataAgendamento;
	private double taxa;
	private TipoOperacao tipoOperacao;
	
	public String getContaOrigem() {
		return contaOrigem;
	}
	
	public void setContaOrigem(String contaOrigem) {
		this.contaOrigem = contaOrigem;
	}
	
	public String getContaDestino() {
		return contaDestino;
	}
	
	public void setContaDestino(String contaDestino) {
		this.contaDestino = contaDestino;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Calendar getDataAgendamento() {
		return dataAgendamento;
	}
	
	public void setDataAgendamento(Calendar dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}
	
	public double getTaxa() {
		return taxa;
	}
	
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public TipoOperacao getTipoOperacao() {
		return tipoOperacao;
	}
	
	public void setTipoOperacao(TipoOperacao tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}
}
