package model.implementation;

import java.util.List;

public class PrefixoNumerado implements PrefixoImplementacao {

	@Override
	public void imprimirLista(List<String> itens) {
		for (int i = 0; i < itens.size(); i++)
			System.out.println(String.valueOf(i + 1).concat(". ").concat(itens.get(i)));
	}
	
	public String toString () {
		return "Prefixo Numerado";
	}	
}
