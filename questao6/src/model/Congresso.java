package model;

import java.util.ArrayList;
import java.util.List;

public class Congresso {

	private List<Participante> participantes = new ArrayList<>();
	
	public int totalParticipantes() {
		int resultado = 0;
		for (Participante p: this.participantes)
			resultado += p.quantidadeParticipantes();
		return resultado;
	}
	
	public int totalAssentos() {
		int resultado = 0;
		for (Participante p: this.participantes)
			resultado += p.quantidadeAssentos();
		return resultado;
	}
	
	public void adicionarParticipante(Participante p) {
		this.participantes.add(p);
	}
}
