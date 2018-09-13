package br.com.cursojava;

import java.util.Scanner;

public class Correcao5 {
	
	public static void main (String args []) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe oa sua idade ");
		int idade = Integer.parseInt(teclado.nextLine());
		int ano = idade / 360;
		int dia = idade % 360;
		int meses = dia / 30;
		int d = dia % 30;
		System.out.printf("Sua idade é de %d anos, %d meses e %d dias ", ano, meses, d );
		
		teclado.close();
}
}