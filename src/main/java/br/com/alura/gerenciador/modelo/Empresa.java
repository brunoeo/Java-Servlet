package br.com.alura.gerenciador.modelo;

import java.util.Date;

public class Empresa {
	
	private String nome;
	private Integer id;
	private Date dataAbertura;
	
	
	
	public Empresa(String nome) {
		this.nome = nome;
		this.dataAbertura = new Date();
	}


	public Empresa(String nome, Date dataAbertura) {
		this.nome = nome;
		this.dataAbertura = dataAbertura;
	}


	public Date getDataAbertura() {
		return dataAbertura;
	}


	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}


	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
}
