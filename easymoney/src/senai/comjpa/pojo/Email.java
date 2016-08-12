package senai.comjpa.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Email {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	private String principal;
	@Override
	public String toString() {
		return "email [id=" + id + ", first=" + principal +  ", second=" + email+ "]"; 
	}

}
