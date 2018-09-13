package br.com.cursojava;

import java.util.Scanner;

public class Exemplo {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua idade ");
		int idade = Integer.parseInt(teclado.nextLine());
		if( idade >= 18 ) {
			System.out.println(" Você é obrigado a votar ");
		} else if (idade >= 16){
			System.out.println(" Sai do sofá e vai votar");
		}else {
			System.out.println(" Você é um pirralho, vota não ");
		}
		System.out.println("Fim da aplicação");
		
		teclado.close();
	}

}