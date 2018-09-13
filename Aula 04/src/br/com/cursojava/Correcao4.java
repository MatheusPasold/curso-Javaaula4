package br.com.cursojava;

import java.util.Scanner;

public class Correcao4 {
	
	public static void main (String args []) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o primeiro número: ");
		int meses = Integer.parseInt(teclado.nextLine());
		int idade = meses * 12;
		System.out.println(" A sua idade em meses é " + idade);

		teclado.close();
}
}