package model;

public class ColchetesDecorator extends PrintableDecorator {

	public ColchetesDecorator(Printable printable) {
		super(printable);
	}

	@Override
	public void print() {
		System.out.print("[");
		printable.print();
		System.out.print("]");
	}	
	
}
