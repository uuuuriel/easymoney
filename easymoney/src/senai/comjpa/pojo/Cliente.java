package senai.comjpa.pojo;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cliente {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nome;
	private double cpf;
	private int rg;
	private Date nascimento;
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Telefone telefone;
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Email emali;
	private String painome;
	private String maenome;
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Endereco endereco;
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Conta conta;
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getCpf() {
		return cpf;
	}



	public void setCpf(double cpf) {
		this.cpf = cpf;
	}



	public int getRg() {
		return rg;
	}



	public void setRg(int rg) {
		this.rg = rg;
	}



	public Date getNascimento() {
		return nascimento;
	}



	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}



	public Telefone getTelefone() {
		return telefone;
	}



	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}



	public Email getEmali() {
		return emali;
	}



	public void setEmali(Email emali) {
		this.emali = emali;
	}



	public String getPainome() {
		return painome;
	}



	public void setPainome(String painome) {
		this.painome = painome;
	}



	public String getMaenome() {
		return maenome;
	}



	public void setMaenome(String maenome) {
		this.maenome = maenome;
	}



	public Endereco getEndereco() {
		return endereco;
	}



	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}



	public Conta getConta() {
		return conta;
	}



	public void setConta(Conta conta) {
		this.conta = conta;
	}



	
//	@Override
//	public String toString() {
//		return "Cliente [id=" + id + ", nome=" + nome + ", cidade=" + cidade
//				+ "]";
//	}
	
}
