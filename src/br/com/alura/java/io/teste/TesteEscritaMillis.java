package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscritaMillis {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de Entrada com Arquivo
//		OutputStream fos = new FileOutputStream("loren2.txt");
//      Writer osw = new OutputStreamWriter(fos);
//      BufferedWriter bw = new BufferedWriter(osw);

//      BufferedWriter bw = new BufferedWriter(new FileWriter("loren2.txt"));
//		PrintStream ps = new PrintStream(new File("loren2.txt"));
		
		long ini = System.currentTimeMillis();
		
		PrintWriter ps = new PrintWriter("loren2.txt");
		
		 ps.println("Lorem ipsum habitasse accumsan faucibus vel "
	        		+ "neque et sollicitudin erat massa eget urna donec mattis,");
		 ps.println();
		 ps.println();
		 ps.println();
		 ps.println();
		 ps.println("hashjgfba fhbal; ALFANjNFDAJ fnaFJNAJ");
		 
        
         ps.close();
         
         long fim = System.currentTimeMillis();
        
         System.out.println("Passaram " + (fim - ini) + " milissegundos");
	}

}
