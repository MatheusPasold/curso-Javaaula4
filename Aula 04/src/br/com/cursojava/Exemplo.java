package br.com.cursojava;

import java.util.Scanner;

public class Exemplo {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua idade ");
		int idade = Integer.parseInt(teclado.nextLine());
		if( idade >= 18 ) {
			System.out.println(" Voc� � obrigado a votar ");
		} else if (idade >= 16){
			System.out.println(" Sai do sof� e vai votar");
		}else {
			System.out.println(" Voc� � um pirralho, vota n�o ");
		}
		System.out.println("Fim da aplica��o");
		
		teclado.close();
	}

}