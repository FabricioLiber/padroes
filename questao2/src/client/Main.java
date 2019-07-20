package client;

import model.SomadorEsperadoAdapter;

public class Main {

	public static void main(String[] args) {
		Client cliente = new Client(new SomadorEsperadoAdapter());
		cliente.executar();
	}

}
