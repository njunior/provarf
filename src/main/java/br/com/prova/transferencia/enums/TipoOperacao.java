package br.com.prova.transferencia.enums;

public enum TipoOperacao {
	TIPO_A(0),
	TIPO_B(1),
	TIPO_C(3),
	TIPO_D(4);

	private Integer tipo;

	TipoOperacao(Integer tipo){
		this.setTipo(tipo);	 
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}	
}
