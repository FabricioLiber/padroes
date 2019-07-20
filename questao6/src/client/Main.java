package client;

import model.Assento;
import model.Congresso;
import model.Individuo;
import model.Instituicao;
import model.Participante;

public class Main {

	public static void main(String[] args) {
		
		Congresso congresso = new Congresso();
		
		Participante individuo1 = new Individuo(null);
		Participante individuo2 = new Individuo(new Assento());
		Participante individuo3 = new Individuo(null);
		Participante individuo4 = new Individuo(new Assento());
		
		congresso.adicionarParticipante(individuo1);
		congresso.adicionarParticipante(individuo2);
		congresso.adicionarParticipante(individuo3);
		congresso.adicionarParticipante(individuo4);
		
		Instituicao instituicao1 = new Instituicao();
		
		Participante individuo5 = new Individuo(null);
		Participante individuo6 = new Individuo(new Assento());
		Participante individuo7 = new Individuo(null);
		Participante individuo8 = new Individuo(new Assento());
		
		instituicao1.adicionarMembro(individuo5);
		instituicao1.adicionarMembro(individuo6);
		instituicao1.adicionarMembro(individuo7);
		instituicao1.adicionarMembro(individuo8);
		
		congresso.adicionarParticipante(instituicao1);
		
		System.out.println("Total de participantes: " + congresso.totalParticipantes());
		System.out.println("Total de assentos: " + congresso.totalAssentos());

	}
	
}
