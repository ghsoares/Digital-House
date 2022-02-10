package PortoSeguro.Exercicios.LacoCondicionais2;

import java.util.Scanner;

//https://docs.google.com/document/d/19gzH_8SXJIlFfUllLvaraPEZytF6wWH7

/* Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
 * */

public class Exercicio3 {
	
	public static void main(String[] args) {
		// Criação de um scanner, usando System.in como input
		Scanner sc = new Scanner(System.in);
		
		int count = 0, less = 0, greater = 0;
		
		// Continua rodando
		while (true) {
			// Input idade do usuário
			System.out.println("\nInsira a idade (insira -99 para encerrar): ");
			int idade = sc.nextInt();
			
			// Encerra o loop
			if (idade == -99) break;
			
			// Espera input válido
			while (idade <= 0) {
				System.out.println("\nA idade deve ser maior que zero! ");
				System.out.println("\nInsira a idade: ");
				idade = sc.nextInt();
			}
			
			// Se for menor que 21, incrementa o número de
			// idades menor que 21, senão incrementa o número
			// de idades maior que 50
			if (idade < 21) less++;
			if (idade > 50) greater++;
			
			// Aumenta o número de pessoas
			count++;
		}
		
		System.out.printf("\n%d pessoas têm menos de 21 anos e %d têm mais de 50 anos\n", less, greater);
		
		// Fecha o scanner para não vazar recursos
		sc.close();
	}

}
