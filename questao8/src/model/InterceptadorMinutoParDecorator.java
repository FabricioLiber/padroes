package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InterceptadorMinutoParDecorator extends ComponenteDecorator {

	public InterceptadorMinutoParDecorator(Componente componente) {
		super(componente);
	}

	@Override
	public void executarTarefa() {
		LocalDateTime agora = LocalDateTime.now();
		
		if (agora.getMinute() % 2 == 0) {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
			System.out.println("Execução interrompida em minuto par: " + dtf.format(LocalDateTime.now()));			
		} else {
			componente.executarTarefa();
		}
	}

}
