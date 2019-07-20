package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InterceptadorLogDecorator extends ComponenteDecorator {

	public InterceptadorLogDecorator(Componente componente) {
		super(componente);
	}

	@Override
	public void executarTarefa() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		System.out.println(dtf.format(LocalDateTime.now()).concat(": Mensagem"));
		componente.executarTarefa();

	}

}
