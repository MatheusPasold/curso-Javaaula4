package br.com.cursojava;

import java.util.Scanner;

public class Correcao6 {
	
	public static void main (String args []) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o valor do produto ");
		double valor = Double.parseDouble(teclado.nextLine());
		System.out.println(" Informe o percentual de desconto");
		double percentual = Double.parseDouble(teclado.nextLine()) / 100;
		double desconto = valor * percentual;
		double precoF = valor - desconto;
		System.out.println(" Valor = " + valor + "\n " + " Percentual desconto = " + percentual + "\n " + " Desconto = " + desconto);
		System.out.println("Valor Final = " + precoF);

		teclado.close();
}
}