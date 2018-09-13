package br.com.cursojava;

import java.util.Scanner;

public class Correcao7 {
//é da dez na verdade
	public static void main (String args []) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Nota 1 ");
		float p = Float.parseFloat(teclado.nextLine());
		float a = Float.parseFloat(teclado.nextLine());
		float imc = p / (a * a);
		System.out.println(imc);
		
		teclado.close();
	}
}
