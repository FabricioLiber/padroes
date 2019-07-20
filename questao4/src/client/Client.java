package client;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import model.abstraction.ListaAbstracao;
import model.abstraction.ListaNaoOrdenada;
import model.abstraction.ListaOrdenada;
import model.implementation.PrefixoImplementacao;
import model.implementation.PrefixoLetra;
import model.implementation.PrefixoMarcador;
import model.implementation.PrefixoNumerado;

public class Client {

	
	private Map<String, ListaAbstracao> listas;
	
	public Client() {
		Map<String, PrefixoImplementacao> prefixos = new TreeMap<>();
		prefixos.put("letra", new PrefixoLetra());
		prefixos.put("numero", new PrefixoNumerado());
		prefixos.put("marcador*", new PrefixoMarcador("*"));
		prefixos.put("marcador-", new PrefixoMarcador("-"));
		
		this.listas = new TreeMap<>();
		this.listas.put("ord-letra", new ListaOrdenada(prefixos.get("letra")));
		this.listas.put("ord-numero", new ListaOrdenada(prefixos.get("numero")));
		this.listas.put("ord-marcador*", new ListaOrdenada(prefixos.get("marcador*")));
		this.listas.put("ord-marcador-", new ListaOrdenada(prefixos.get("marcador-")));
		
		this.listas.put("unord-letra", new ListaNaoOrdenada(prefixos.get("letra")));
		this.listas.put("unord-numero", new ListaNaoOrdenada(prefixos.get("numero")));
		this.listas.put("unord-marcador*", new ListaNaoOrdenada(prefixos.get("marcador*")));
		this.listas.put("unord-marcador-", new ListaNaoOrdenada(prefixos.get("marcador-")));

	}

	public Map<String, ListaAbstracao> getlistas() {
		return listas;
	}
		
	public void executar () {
		boolean finalizado = false;
		Scanner teclado = new Scanner(System.in);
		while (!finalizado) {
			System.out.println("Selecione uma Lista e Marcador: (Ex: ord-letra, ord-marcador*, unord-numero, unord-marcador-)");
			System.out.println("Caso queria sair, digite 'S'");
			String selecao = teclado.nextLine();
			ListaAbstracao listaAbstracao = this.listas.get(selecao);
			if (listaAbstracao != null) {
				System.out.println("Digite 3 Linhas:");
				for (int i = 0; i < 3; i++)
					listaAbstracao.adicionar(teclado.nextLine());
				listaAbstracao.imprimir();
			} else if (selecao.equalsIgnoreCase("S"))
				finalizado = true;
			else
				System.out.println("Lista-Marcador não encontrado!");
		}
		teclado.close();
		System.out.println("Seleção de Lista-Marcador finalizada!");
	}
}