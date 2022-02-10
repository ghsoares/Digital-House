package PortoSeguro.Exercicios.LacoCondicionais2;

import java.util.Scanner;

//https://docs.google.com/document/d/19gzH_8SXJIlFfUllLvaraPEZytF6wWH7

/* Informar todos os números de 1000 a 1999 que quando divididos 
 * por 11 obtemos resto = 5. (FOR)
 * */

public class Exercicio1 {

	public static void main(String[] args) {
		// Criação de um scanner, usando System.in como input
		Scanner sc = new Scanner(System.in);

		// For loop, n tem o range de [1000,1999]
		for (int n = 1000; n <= 1999; n++) {
			// Resto da divisão por 11
			int dr = n % 11;
			
			// Mostra os números que o resto dá 5
			if (dr == 5) {
				System.out.printf("\nNúmero %d\n", n);
			}
		}

		// Fecha o scanner para não vazar recursos
		sc.close();
	}

}
