package model;

public class InterceptadorTempoDecorator extends ComponenteDecorator {

	public InterceptadorTempoDecorator(Componente componente) {
		super(componente);
	}

	@Override
	public void executarTarefa() {
		long antes = System.currentTimeMillis();
		this.componente.executarTarefa();
		long depois = System.currentTimeMillis();
		System.out.println((depois - antes) + "ms");
	}

}
