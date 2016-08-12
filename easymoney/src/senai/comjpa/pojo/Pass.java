package senai.comjpa.pojo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Pass {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@NotNull
	private String eletronico;
	@NotNull
	private String internet;
	private int wrong;
	private Date wrong_date;
	private Cliente cliente;
	private String token;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEletronico() {
		return eletronico;
	}
	public void setEletronico(String eletronico) {
		this.eletronico = eletronico;
	}
	public String getInternet() {
		return internet;
	}
	public void setInternet(String internet) {
		this.internet = internet;
	}
	public int getWrong() {
		return wrong;
	}
	public void setWrong(int wrong) {
		this.wrong = wrong;
	}
	public Date getWrong_date() {
		return wrong_date;
	}
	public void setWrong_date(Date wrong_date) {
		this.wrong_date = wrong_date;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	@Override
	public String toString() {
		return "";
	}
	
}
