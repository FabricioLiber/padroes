package model.implementation;

import java.util.List;

public class PrefixoLetra implements PrefixoImplementacao {

	@Override
	public void imprimirLista(List<String> itens) {
		for (char letra = 'A'; letra < 'A' + itens.size(); letra++)
			System.out.println(letra + ". " + itens.get(letra - 'A'));
	}

	public String toString () {
		return "Prefixo Letra";
	}
	
}
