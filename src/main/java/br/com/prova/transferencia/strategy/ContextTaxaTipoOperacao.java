package br.com.prova.transferencia.strategy;

import java.util.Calendar;

public class ContextTaxaTipoOperacao {
	
		private double valor;
		private Calendar dataAgendamento;
		TaxaTipoOperacao taxaTipoOperacao;

		public ContextTaxaTipoOperacao(double valor, Calendar dataAgendamento, TaxaTipoOperacao taxaTipoOperacao) {
			this.valor = valor;
			this.dataAgendamento = dataAgendamento;
			this.taxaTipoOperacao = taxaTipoOperacao;
		}
		
		public double getResult() {
			return taxaTipoOperacao.calcularTaxa(valor, dataAgendamento);
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
}
