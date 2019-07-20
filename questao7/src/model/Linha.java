package model;

import java.util.ArrayList;
import java.util.List;

public class Linha implements Printable {

	private List<Printable> celulas = new ArrayList<>();
	
	public void adicionar(Printable celula) {
		this.celulas.add(celula);
	}
	
	@Override
	public void print() {
		// Imprime a borda lateral inicial
		System.out.print("| ");
		// Imprime a linha
		
		for (Printable celula: this.celulas)
			celula.print();

		// Pula a Linha
		System.out.println("");
	}

}
