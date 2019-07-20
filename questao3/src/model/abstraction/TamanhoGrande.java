package model.abstraction;

import model.implementation.RefrigeranteImplementacao;

public class TamanhoGrande extends TamanhoAbstracao {

	public TamanhoGrande(RefrigeranteImplementacao refrigerante) {
		super(refrigerante);
	}

	@Override
	public void beber() {
		System.out.println("Glub Glub Glub Glub Glub Glub " + refrigerante);
		System.out.println("Acabou o(a) " + refrigerante + " Grande\n");
	}

	
	
}
