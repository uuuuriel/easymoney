package br.com.easymoney.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Endereco {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String rua;
	private String logradouro;
	private int numero;
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Cidade cidade;
	
	@Override
	public String toString() {
		return "teste [id=" + id + ", rua=" + rua+  ", logradouro=" + logradouro + ", fone=" + numero +  "]"; 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
}
