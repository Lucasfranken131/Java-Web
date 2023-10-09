package br.com.fmp.modelo;

public class Filme {
	
	private String nome;
	private String categoria;
	private integer ano;
	
	public Filme(String nome, String categoria, integer ano) {
		this.nome = nome;
		this.categoria = categoria;
		this.ano = ano
	}
	
	public getNome() {
		return this.nome;
	}
	
	public getCategoria() {
		return this.categoria;
	}
	
	public getAno() {
		return this.ano;
	}
}
