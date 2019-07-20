package model;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements Propriedade {

	private List<Propriedade> childrens;
	private String nome;
	
	public Pasta(String nome) {
		this.nome = nome;
		this.childrens = new ArrayList<>();
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public double getTamanho() {
		double resultado = 0;
		for (Propriedade p: this.childrens)
			resultado += p.getTamanho();
		return resultado;
	}
	
	public void add (Propriedade children) {
		this.childrens.add(children);
	}
	
	public void remove (Propriedade children) {
		this.childrens.remove(children);
	}
	
	public void remove (int index) {
		this.childrens.remove(index);
	}

}
