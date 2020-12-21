package br.com.alura.java.io.teste;

import java.util.Properties;

public class TesteLoginAlura {

	public static void main(String[] args) {
		
		//import deve ser java.util.Properties
		Properties props = new Properties(); 
		props.setProperty("login", "alura"); //chave, valor
		props.setProperty("senha", "alurapass");
		props.setProperty("endereco", "www.alura.com.br");

	}

}
