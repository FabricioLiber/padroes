package model;

public class ChavesDecorator extends PrintableDecorator {

	public ChavesDecorator(Printable printable) {
		super(printable);
	}

	@Override
	public void print() {
		System.out.print("{");
		printable.print();
		System.out.print("}");
	}	
	
}
