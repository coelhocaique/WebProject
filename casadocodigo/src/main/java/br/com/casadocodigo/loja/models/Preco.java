package br.com.casadocodigo.loja.models;

import java.math.BigDecimal;

import javax.persistence.Embeddable;

@Embeddable
public class Preco {
	
	private BigDecimal valor;
	private TipoPreco tipoPreco;
	
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public TipoPreco getTipo() {
		return tipoPreco;
	}
	public void setTipo(TipoPreco tipo) {
		this.tipoPreco = tipo;
	}
	
	
}
