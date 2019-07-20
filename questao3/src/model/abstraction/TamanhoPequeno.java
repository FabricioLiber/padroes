package model.abstraction;

import model.implementation.RefrigeranteImplementacao;

public class TamanhoPequeno extends TamanhoAbstracao {

	public TamanhoPequeno(RefrigeranteImplementacao refrigerante) {
		super(refrigerante);
	}

	@Override
	public void beber() {
		System.out.println("Glub Glub " + refrigerante);
		System.out.println("Acabou o(a) " + refrigerante + " Pequeno\n");
	}

	
	
}
