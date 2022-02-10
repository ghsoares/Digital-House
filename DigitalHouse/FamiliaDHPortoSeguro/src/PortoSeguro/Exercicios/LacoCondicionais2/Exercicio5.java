package PortoSeguro.Exercicios.LacoCondicionais2;

import java.util.Scanner;

//https://docs.google.com/document/d/19gzH_8SXJIlFfUllLvaraPEZytF6wWH7

/* Crie um programa que leia um n�mero do teclado at� que 
 * encontre um n�mero igual a zero. No final, mostre a soma 
 * dos n�meros digitados.(DO...WHILE)
 * */

public class Exercicio5 {

	public static void main(String[] args) {
		// Cria��o de um scanner, usando System.in como input
		Scanner sc = new Scanner(System.in);

		int soma = 0, num;
		
		// Executa pelo menos uma vez
		do {
			// Input n�mero do usu�rio
			System.out.println("\nInsira um n�mero: ");
			num = sc.nextInt();
			
			// Soma o n�mero
			soma += num;
		} while(num != 0);

		// Mostra a soma dos n�meros
		System.out.printf("\nSoma: %d \n", soma);
		
		// Fecha o scanner para n�o vazar recursos
		sc.close();
	}

}
