package br.com.fmp.modelo;

public class Filme {
	
	private String nome;
	private String genero;
	private int ano;
	
	public Filme(String nome, String genero, int ano) {
		this.nome = nome;
		this.genero = genero;
		this.ano = ano;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getGenero() {
		return this.genero;
	}
	
	public int getAno() {
		return this.ano;
	}
}
