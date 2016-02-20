package br.com.prova.transferencia.enums;

import br.com.prova.transferencia.strategy.TaxaTipoOperacao;
import br.com.prova.transferencia.strategy.impl.TaxaTipoOperacaoA;
import br.com.prova.transferencia.strategy.impl.TaxaTipoOperacaoB;
import br.com.prova.transferencia.strategy.impl.TaxaTipoOperacaoC;
import br.com.prova.transferencia.strategy.impl.TaxaTipoOperacaoD;

public enum TipoOperacao {
	
	TIPO_A("A"){		
		@Override
		public TaxaTipoOperacao taxaTipoOperacao(){
			return new TaxaTipoOperacaoA();
		}		
	},
	TIPO_B("B"){
		@Override
		public TaxaTipoOperacao taxaTipoOperacao(){
			return new TaxaTipoOperacaoB();
		}		
	},
	TIPO_C("C"){
		@Override
		public TaxaTipoOperacao taxaTipoOperacao(){
			return new TaxaTipoOperacaoC();
		}		
	},
	TIPO_D("D"){
		@Override
		public TaxaTipoOperacao taxaTipoOperacao(){
			return new TaxaTipoOperacaoD();
		}		
	};

	private String codigo;
	
	public abstract TaxaTipoOperacao taxaTipoOperacao();
	
	TipoOperacao(String codigo){
		this.setCodigo(codigo);
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}	
}
