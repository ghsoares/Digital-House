package PortoSeguro.Exercicios.LacoCondicionais2;

import java.util.Scanner;

//https://docs.google.com/document/d/19gzH_8SXJIlFfUllLvaraPEZytF6wWH7

/* Crie um programa que leia um número do teclado até que 
 * encontre um número igual a zero. No final, mostre a soma 
 * dos números digitados.(DO...WHILE)
 * */

public class Exercicio5 {

	public static void main(String[] args) {
		// Criação de um scanner, usando System.in como input
		Scanner sc = new Scanner(System.in);

		int soma = 0, num;
		
		// Executa pelo menos uma vez
		do {
			// Input número do usuário
			System.out.println("\nInsira um número: ");
			num = sc.nextInt();
			
			// Soma o número
			soma += num;
		} while(num != 0);

		// Mostra a soma dos números
		System.out.printf("\nSoma: %d \n", soma);
		
		// Fecha o scanner para não vazar recursos
		sc.close();
	}

}
