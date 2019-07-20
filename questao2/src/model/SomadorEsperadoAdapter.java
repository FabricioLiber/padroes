package model;

import java.util.ArrayList;
import java.util.List;

public class SomadorEsperadoAdapter implements SomadorEsperado {

	private SomadorExistente somadorExistente;
	
	public SomadorEsperadoAdapter () {
		this.somadorExistente = new SomadorExistente();
	}
	
	@Override
	public int somaVetor(int[] vetor) {
		List<Integer> lista = new ArrayList<Integer>();
		for (int i = 0; i < vetor.length; i++)
			lista.add(vetor[i]);
		return this.somadorExistente.somaLista(lista);
	}

}
