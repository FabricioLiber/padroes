package client;

import java.util.ArrayList;
import java.util.List;

import model.Celula;
import model.Linha;
import model.Printable;
import model.Tabela;

public class Main {

	public static void main(String[] args) {
				
		Celula celula1A = new Celula("Nome");
		Celula celula1B = new Celula("Idade");
		Celula celula1C = new Celula("Período");
		
		
		Celula celula2A = new Celula("Fabrício");
		Celula celula2B = new Celula("21");
		Celula celula2C = new Celula("5º");
		
		Celula celula3A = new Celula("Rafael");
		Celula celula3B = new Celula("33");
		Celula celula3C = new Celula("5º");
		
		Celula celula4A = new Celula("John");
		Celula celula4B = new Celula("25");
		Celula celula4C = new Celula("5º");
		
		List<Printable> linhas = new ArrayList<>();
		
		Linha linha1 = new Linha();
		linha1.adicionar(celula1A);
		linha1.adicionar(celula1B);
		linha1.adicionar(celula1C);
		
		
		Linha linha2 = new Linha();
		linha2.adicionar(celula2A);
		linha2.adicionar(celula2B);
		linha2.adicionar(celula2C);
		
		Linha linha3 = new Linha();
		linha3.adicionar(celula3A);
		linha3.adicionar(celula3B);
		linha3.adicionar(celula3C);
		
		Linha linha4 = new Linha();
		linha4.adicionar(celula4A);
		linha4.adicionar(celula4B);
		linha4.adicionar(celula4C);
		
		linhas.add(linha1);
		linhas.add(linha2);
		linhas.add(linha3);
		linhas.add(linha4);
		
		Tabela tabela = new Tabela();
		
		tabela.adicionarMuitos(linhas);
		
		tabela.print();

	}
	
}
