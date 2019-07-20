package model;

public class ParentesesDecorator extends PrintableDecorator {

	public ParentesesDecorator(Printable printable) {
		super(printable);
	}

	@Override
	public void print() {
		System.out.print("(");
		printable.print();
		System.out.print(")");
	}	
	
}
