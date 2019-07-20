package model.abstraction;

import model.implementation.PrefixoImplementacao;

public class ListaNaoOrdenada extends ListaAbstracao {

	public ListaNaoOrdenada(PrefixoImplementacao prefixo) {
		super(prefixo);
	}

	@Override
	public void adicionar(String item) {
		this.lista.add(item);
	}

	@Override
	public void imprimir() {
		System.out.println("Lista Não Ordenada com " + prefixo);
		this.prefixo.imprimirLista(this.lista);
	}
	
}
