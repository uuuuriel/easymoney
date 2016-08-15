package br.com.easymoney.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cidade {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String cidade;
	@Override
	public String toString() {
		return "Cidade [id=" + id + ", nome=" + cidade 
				+ "]";
	}
	
}
