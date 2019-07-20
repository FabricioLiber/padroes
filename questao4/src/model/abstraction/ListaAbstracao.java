package model.abstraction;

import java.util.ArrayList;
import java.util.List;

import model.implementation.PrefixoImplementacao;

public abstract class ListaAbstracao {

	protected List<String> lista = new ArrayList<>();
	protected PrefixoImplementacao prefixo;
	
	public ListaAbstracao(PrefixoImplementacao prefixo) {
		this.prefixo = prefixo;
	}
	
	public abstract void adicionar(String item);

	public abstract void imprimir();
	
}
