package model.implementation;

import java.util.List;

public class PrefixoMarcador implements PrefixoImplementacao {

	private String marcador;
	
	public PrefixoMarcador(String marcador) {
		this.marcador = marcador;
	}
	
	@Override
	public void imprimirLista(List<String> itens) {
		for (int i = 0; i < itens.size(); i++)
			System.out.println(marcador.concat(" ").concat(itens.get(i)));
	}
	
	public String toString () {
		return "Prefixo Marcador (" + marcador + ")";
	}
}
