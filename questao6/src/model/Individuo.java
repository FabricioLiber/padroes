package model;

public class Individuo implements Participante {
	
	private Assento assento;
	
	public Individuo (Assento assento) {
		this.assento = assento;
	}
	
	public Assento getAssento() {
		return this.assento;
	}

	@Override
	public int quantidadeParticipantes() {
		return 1;
	}

	@Override
	public int quantidadeAssentos() {
		if (this.assento == null)
			return 0;
		return 1;
	}

}
