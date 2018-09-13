package br.com.cursojava.hello;

public class Exercicio6 {
	
	public static void main (String args[]) {
		int a = 10; 
		int b = 15;
		int c = 20;
		int valorM = 0;
		
		int valor = Math.max(a, b);
		
		valorM = Math.max(valor, c);
		
		System.out.println(valorM);
		//System.out.println(Math.max(Math.max(10, 20), 15));
	}

}
