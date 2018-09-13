package br.com.cursojava;

import java.util.Scanner;

public class Correcao3 {
	
	public static void main (String args []) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o primeiro número: ");
		int idade = Integer.parseInt(teclado.nextLine());
		int ida20 = idade + 20;
		System.out.println(" A sua idade daqui a 20 anos será " + ida20);
		teclado.close();
}
}