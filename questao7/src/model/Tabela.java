package model;

import java.util.ArrayList;
import java.util.List;

public class Tabela implements Printable {

	private List<Printable> linhas = new ArrayList<>();
	
	@Override
	public void print() {
		for (Printable p: this.linhas)
			p.print();
	}

	public void adicionar (Printable linha) {
		this.linhas.add(linha);
	}
	
	public void adicionarMuitos (List<Printable> linhas) {
		this.linhas.addAll(linhas);
	}
	
}
