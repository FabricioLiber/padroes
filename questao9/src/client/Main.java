package client;

import model.ChavesDecorator;
import model.ColchetesDecorator;
import model.NumeroUm;
import model.ParentesesDecorator;
import model.Printable;

public class Main {

	public static void main(String[] args) {
		
		Printable numeroUm = new NumeroUm();
		
		numeroUm.print();
		System.out.println();
		
		Printable parentesesDecorator = new ParentesesDecorator(numeroUm);
		
		parentesesDecorator.print();
		System.out.println();
		
		Printable parentesesDecorator2 = new ParentesesDecorator(parentesesDecorator);
		
		parentesesDecorator2.print();
		System.out.println();
		
		Printable chavesDecorator = new ChavesDecorator(parentesesDecorator2);
		
		chavesDecorator.print();
		System.out.println();
		
		Printable colchetesDecorator = new ColchetesDecorator(chavesDecorator);
		
		colchetesDecorator.print();
		
	}
	
}
