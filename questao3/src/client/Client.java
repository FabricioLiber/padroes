package client;


import java.util.Map;
import java.util.TreeMap;

import java.util.Scanner;

import model.abstraction.TamanhoAbstracao;
import model.abstraction.TamanhoFamilia;
import model.abstraction.TamanhoGrande;
import model.abstraction.TamanhoMedio;
import model.abstraction.TamanhoPequeno;
import model.implementation.CocaCola;
import model.implementation.Fanta;
import model.implementation.Guarana;
import model.implementation.RefrigeranteImplementacao;
import model.implementation.Sprite;

public class Client {

	
	private Map<String, TamanhoAbstracao> tamanhos;
	
	public Client() {
		Map<String, RefrigeranteImplementacao> refrigerantes = new TreeMap<>();
		refrigerantes.put("coca-cola", new CocaCola());
		refrigerantes.put("guarana", new Guarana());
		refrigerantes.put("fanta", new Fanta());
		refrigerantes.put("sprite", new Sprite());
		
		this.tamanhos = new TreeMap<>();
		this.tamanhos.put("coca-pequeno", new TamanhoPequeno(refrigerantes.get("coca-cola")));
		this.tamanhos.put("coca-medio", new TamanhoMedio(refrigerantes.get("coca-cola")));
		this.tamanhos.put("coca-grande", new TamanhoGrande(refrigerantes.get("coca-cola")));
		this.tamanhos.put("coca-familia", new TamanhoFamilia(refrigerantes.get("coca-cola")));
		
		this.tamanhos.put("guarana-pequeno", new TamanhoPequeno(refrigerantes.get("guarana")));
		this.tamanhos.put("guarana-medio", new TamanhoMedio(refrigerantes.get("guarana")));
		this.tamanhos.put("guarana-grande", new TamanhoGrande(refrigerantes.get("guarana")));
		this.tamanhos.put("guarana-familia", new TamanhoFamilia(refrigerantes.get("guarana")));
		
		this.tamanhos.put("fanta-pequeno", new TamanhoPequeno(refrigerantes.get("fanta")));
		this.tamanhos.put("fanta-medio", new TamanhoMedio(refrigerantes.get("fanta")));
		this.tamanhos.put("fanta-grande", new TamanhoGrande(refrigerantes.get("fanta")));
		this.tamanhos.put("fanta-familia", new TamanhoFamilia(refrigerantes.get("fanta")));
		
		this.tamanhos.put("sprite-pequeno", new TamanhoPequeno(refrigerantes.get("sprite")));
		this.tamanhos.put("sprite-medio", new TamanhoMedio(refrigerantes.get("sprite")));
		this.tamanhos.put("sprite-grande", new TamanhoGrande(refrigerantes.get("sprite")));
		this.tamanhos.put("sprite-familia", new TamanhoFamilia(refrigerantes.get("sprite")));
	}

	public Map<String, TamanhoAbstracao> getTamanhos() {
		return tamanhos;
	}
		
	public void executar () {
		boolean finalizado = false;
		Scanner teclado = new Scanner(System.in);
		while (!finalizado) {
			System.out.println("Selecione um refrigerante: (Ex: coca-grande, fanta-pequeno, sprite-familia, guarana-medio)");
			System.out.println("Caso queria sair, digite 'S'");
			String selecao = teclado.nextLine();
			TamanhoAbstracao tamanhoAbstracao = this.tamanhos.get(selecao);
			if (tamanhoAbstracao != null)
				tamanhoAbstracao.beber();
			else if (selecao.equalsIgnoreCase("S"))
				finalizado = true;
			else
				System.out.println("Refrigerante não encontrado!");
		}
		teclado.close();
		System.out.println("Seleção de refrigerante finalizada!");
	}
}