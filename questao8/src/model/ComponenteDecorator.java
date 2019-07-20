package model;

public abstract class ComponenteDecorator implements Componente {

	protected Componente componente;
	
	public ComponenteDecorator (Componente componente) {
		this.componente= componente;
	}

}
