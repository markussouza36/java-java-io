package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de Entrada com Arquivo
		OutputStream fos = new FileOutputStream("loren2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

		 bw.write("Lorem ipsum habitasse accumsan faucibus vel "
        		+ "neque et sollicitudin erat massa eget urna donec mattis,");
         bw.newLine();
         bw.write("hashjgfba fhbal; ALFANjNFDAJ fnaFJNAJ");
        
         bw.close();
        
	}

}
