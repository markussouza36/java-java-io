package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class EscritaDeProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Scanner sc = new Scanner("conf.properties.txt");
		Properties props = new Properties();        
		props.load(new FileReader("conf.properties"));
		
		props.store(new FileWriter("conf.properties"), "algum comentário");

		String login = props.getProperty("login");
		String senha = props.getProperty("senha");
		String endereco = props.getProperty("endereco");

		sc.close();
		
		System.out.println(login + ", " + senha  + ", " +  endereco);

	}
	
}
