package PortoSeguro.Exercicios.LacoCondicionais2;

import java.util.Scanner;

//https://docs.google.com/document/d/19gzH_8SXJIlFfUllLvaraPEZytF6wWH7

/* Escrever um programa que receba vários números inteiros no teclado. 
 * E no final imprimir a média dos números múltiplos de 3. 
 * Para sair digitar 0(zero).(DO...WHILE)
 * */

public class Exercicio6 {

	public static void main(String[] args) {
		// Criação de um scanner, usando System.in como input
		Scanner sc = new Scanner(System.in);

		int num, count = 0, soma = 0;
		
		// Executa pelo menos uma vez
		do {
			// Input número do usuário
			System.out.println("\nInsira um número: ");
			num = sc.nextInt();
			
			// Caso o resto da divisão por 3 é zero, é múltiplo de 3
			if (num != 0 && num % 3 == 0) {
				// Soma o número
				soma += num;
				
				// Incrementa a contagem
				count++;
			}
		} while(num != 0);
		
		// Calcula a média
		int media = soma / Math.max(count, 1);
		
		// Mostra a média
		System.out.printf("\nMédia: %d", media);
		
		// Fecha o scanner para não vazar recursos
		sc.close();
	}

}
