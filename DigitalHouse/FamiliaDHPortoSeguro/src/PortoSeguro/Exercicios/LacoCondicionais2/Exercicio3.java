package PortoSeguro.Exercicios.LacoCondicionais2;

import java.util.Scanner;

//https://docs.google.com/document/d/19gzH_8SXJIlFfUllLvaraPEZytF6wWH7

/* Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
 * */

public class Exercicio3 {
	
	public static void main(String[] args) {
		// Cria��o de um scanner, usando System.in como input
		Scanner sc = new Scanner(System.in);
		
		int count = 0, less = 0, greater = 0;
		
		// Continua rodando
		while (true) {
			// Input idade do usu�rio
			System.out.println("\nInsira a idade (insira -99 para encerrar): ");
			int idade = sc.nextInt();
			
			// Encerra o loop
			if (idade == -99) break;
			
			// Espera input v�lido
			while (idade <= 0) {
				System.out.println("\nA idade deve ser maior que zero! ");
				System.out.println("\nInsira a idade: ");
				idade = sc.nextInt();
			}
			
			// Se for menor que 21, incrementa o n�mero de
			// idades menor que 21, sen�o incrementa o n�mero
			// de idades maior que 50
			if (idade < 21) less++;
			if (idade > 50) greater++;
			
			// Aumenta o n�mero de pessoas
			count++;
		}
		
		System.out.printf("\n%d pessoas t�m menos de 21 anos e %d t�m mais de 50 anos\n", less, greater);
		
		// Fecha o scanner para n�o vazar recursos
		sc.close();
	}

}
