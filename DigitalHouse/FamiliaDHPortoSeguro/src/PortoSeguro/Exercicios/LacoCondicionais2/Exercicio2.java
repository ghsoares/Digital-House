package PortoSeguro.Exercicios.LacoCondicionais2;

import java.util.Scanner;

//https://docs.google.com/document/d/19gzH_8SXJIlFfUllLvaraPEZytF6wWH7

/* Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
* */

public class Exercicio2 {
	
	public static void main(String[] args) {
		// Cria��o de um scanner, usando System.in como input
		Scanner sc = new Scanner(System.in);
		
		int pares = 0, impares = 0;
		
		// For loop, i tem o range [1,10]
		for (int i = 1; i <= 10; i++) {
			// Input do usu�rio
			System.out.printf("\nInsira o n�mero %d: \n", i);
			int n = sc.nextInt();
			
			// Incrementa os pares se o resto da divis�o por 2 � 0,
			// sen�o incrementa �mpares
			if (n % 2 == 0) pares++;
			else impares++;
		}
		
		System.out.printf("\n%d N�meros s�o pares e %d s�o �mpares", pares, impares);
		
		// Fecha o scanner para n�o vazar recursos
		sc.close();
	}

}
