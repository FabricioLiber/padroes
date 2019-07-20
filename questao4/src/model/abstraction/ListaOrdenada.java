package model.abstraction;


import java.util.Collections;

import model.implementation.PrefixoImplementacao;

public class ListaOrdenada extends ListaAbstracao {

	public ListaOrdenada(PrefixoImplementacao prefixo) {
		super(prefixo);
	}

	@Override
	public void adicionar(String item) {
		this.lista.add(item);
		Collections.sort(this.lista);
	}

	@Override
	public void imprimir() {
		System.out.println("Lista Ordenada com " + prefixo);
		this.prefixo.imprimirLista(this.lista);
	}

}
