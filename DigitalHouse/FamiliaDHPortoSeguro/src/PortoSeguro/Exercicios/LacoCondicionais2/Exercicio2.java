package PortoSeguro.Exercicios.LacoCondicionais2;

import java.util.Scanner;

//https://docs.google.com/document/d/19gzH_8SXJIlFfUllLvaraPEZytF6wWH7

/* Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
* */

public class Exercicio2 {
	
	public static void main(String[] args) {
		// Criação de um scanner, usando System.in como input
		Scanner sc = new Scanner(System.in);
		
		int pares = 0, impares = 0;
		
		// For loop, i tem o range [1,10]
		for (int i = 1; i <= 10; i++) {
			// Input do usuário
			System.out.printf("\nInsira o número %d: \n", i);
			int n = sc.nextInt();
			
			// Incrementa os pares se o resto da divisão por 2 é 0,
			// senão incrementa ímpares
			if (n % 2 == 0) pares++;
			else impares++;
		}
		
		System.out.printf("\n%d Números são pares e %d são ímpares", pares, impares);
		
		// Fecha o scanner para não vazar recursos
		sc.close();
	}

}
