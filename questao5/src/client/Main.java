package client;

import model.Arquivo;
import model.Pasta;
import model.Propriedade;

public class Main {

	public static void main(String[] args) {
		
		Propriedade texto = new Arquivo("texto.txt", 50);
		Propriedade musica = new Arquivo("musica.mp3", 2480);
		Propriedade pastaVideos = new Pasta("Vídeos");
		Propriedade video = new Arquivo("musica.mp3", 54230);
		
		Pasta pasta = new Pasta("root"); 
		pasta.add(texto);
		pasta.add(musica);
		pasta.add(pastaVideos);
		((Pasta) pastaVideos).add(video);
		
		System.out.println("Texto (expected: 50): " + texto.getTamanho());
		System.out.println("Música (expected: 2480): " + musica.getTamanho());
		System.out.println("Pasta de Vídeos (expected: 54230): " + pastaVideos.getTamanho());
		System.out.println("Pasta Root (expected: 56760): " + pasta.getTamanho());
		
		
		

	}
	
}
