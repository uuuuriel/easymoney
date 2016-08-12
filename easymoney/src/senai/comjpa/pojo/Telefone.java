package senai.comjpa.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Telefone {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String telefone;
	private String principal;
	private Cliente cliente;
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	@Override
	public String toString() {
		return "FONES [id-FONE=" + id + ", fone=" + principal +  ", fone - 2=" + telefone + "]"; 
	}
}
