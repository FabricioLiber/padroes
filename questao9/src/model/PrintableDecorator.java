package model;

public abstract class PrintableDecorator implements Printable {

	protected Printable printable;
	
	public PrintableDecorator(Printable printable) {
		this.printable = printable;
	}
	
}
