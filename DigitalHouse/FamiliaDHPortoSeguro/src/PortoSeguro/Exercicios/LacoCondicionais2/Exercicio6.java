package PortoSeguro.Exercicios.LacoCondicionais2;

import java.util.Scanner;

//https://docs.google.com/document/d/19gzH_8SXJIlFfUllLvaraPEZytF6wWH7

/* Escrever um programa que receba v�rios n�meros inteiros no teclado. 
 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. 
 * Para sair digitar 0(zero).(DO...WHILE)
 * */

public class Exercicio6 {

	public static void main(String[] args) {
		// Cria��o de um scanner, usando System.in como input
		Scanner sc = new Scanner(System.in);

		int num, count = 0, soma = 0;
		
		// Executa pelo menos uma vez
		do {
			// Input n�mero do usu�rio
			System.out.println("\nInsira um n�mero: ");
			num = sc.nextInt();
			
			// Caso o resto da divis�o por 3 � zero, � m�ltiplo de 3
			if (num != 0 && num % 3 == 0) {
				// Soma o n�mero
				soma += num;
				
				// Incrementa a contagem
				count++;
			}
		} while(num != 0);
		
		// Calcula a m�dia
		int media = soma / Math.max(count, 1);
		
		// Mostra a m�dia
		System.out.printf("\nM�dia: %d", media);
		
		// Fecha o scanner para n�o vazar recursos
		sc.close();
	}

}
