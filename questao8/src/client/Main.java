package client;

import model.Componente;
import model.ComponenteConcreto;
import model.InterceptadorLogDecorator;
import model.InterceptadorMinutoParDecorator;
import model.InterceptadorTempoDecorator;

public class Main {

	public static void main(String[] args) {
		
		Componente componenteConcreto = new ComponenteConcreto();
		System.out.println("Componente Concreto: ");
		componenteConcreto.executarTarefa();
		System.out.println();
		
		Componente interceptadorTempoDecorator = new InterceptadorTempoDecorator(componenteConcreto);
		
		System.out.println("Interceptador Tempo: ");
		interceptadorTempoDecorator.executarTarefa();
		System.out.println();
		
		Componente interceptadorLogDecorator = new InterceptadorLogDecorator(interceptadorTempoDecorator);
		
		System.out.println("Interceptador Log: ");
		interceptadorLogDecorator.executarTarefa();
		System.out.println();
		
		Componente interceptadorMinutoParDecorator = new InterceptadorMinutoParDecorator(interceptadorLogDecorator);
		
		System.out.println("Interceptador Minuto Par: ");
		interceptadorMinutoParDecorator.executarTarefa();
		System.out.println();
	}	
}
