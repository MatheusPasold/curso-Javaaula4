package br.com.cursojava;

import java.util.Scanner;

public class Correcao1 {
	
	public static void main (String args []) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o primeiro número: ");
		double numero1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe o primeiro número: ");
		double numero2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe o primeiro número: ");
		double numero3 = Double.parseDouble(teclado.nextLine());
		double media = (numero1 + numero2 + numero3) / 3;
		System.out.println(" A média dos números digitados é " + media);
		teclado.close();
}
}