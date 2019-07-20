package model;

public class Celula implements Printable {

	private String conteudo;
	
	public Celula (String conteudo) {
		this.conteudo = conteudo;
	}
	
	@Override
	public void print() {
		// Limita o conteudo a exatamente 15 caracteres.
		conteudo += " ";
		int lenght = 15;
		if(conteudo.length() < lenght) {
			char [] espacos = new char[lenght - conteudo.length()];
			for (int i = 0; i < espacos.length; i ++)
				espacos[i] = ' ';
			conteudo += new String(espacos);
		} else {
			conteudo = conteudo.substring(0, lenght);
		}
		
		// Imprime na mesma linha e com borda lateral.
		System.out.print(conteudo +" | ");

	}

}
