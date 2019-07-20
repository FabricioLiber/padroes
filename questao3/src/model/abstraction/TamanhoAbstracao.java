package model.abstraction;

import model.implementation.RefrigeranteImplementacao;

public abstract class TamanhoAbstracao {

	protected RefrigeranteImplementacao refrigerante;
	
	public TamanhoAbstracao (RefrigeranteImplementacao refrigerante) {
		this.refrigerante = refrigerante;
	}
	
	public abstract void beber();
	
}
