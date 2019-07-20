package model;

import java.util.ArrayList;
import java.util.List;

public class Instituicao implements Participante {

	private List<Participante> membros = new ArrayList<>();
	
	public List<Participante> getMembros() {
		return this.membros;
	}

	@Override
	public int quantidadeParticipantes() {
		int resultado = 0;
		for (Participante p: this.membros)
			resultado += p.quantidadeParticipantes();
		return resultado;			
	}

	@Override
	public int quantidadeAssentos() {
		int resultado = 0;
		for (Participante p: this.membros)
			resultado += p.quantidadeAssentos();
		return resultado;
	}
	
	public void adicionarMembro(Participante p) {
		this.membros.add(p);
	}
	
}
