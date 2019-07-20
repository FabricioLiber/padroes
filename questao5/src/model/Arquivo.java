package model;

public class Arquivo implements Propriedade {
	
	private String nome;
	private double tamanho;
	
	public Arquivo(String nome, double tamanho) {
		this.nome = nome;
		this.tamanho = tamanho;
	}
	
	public String getNome() {
		return this.nome;
	}

	@Override
	public double getTamanho() {
		return this.tamanho;
	}

}
