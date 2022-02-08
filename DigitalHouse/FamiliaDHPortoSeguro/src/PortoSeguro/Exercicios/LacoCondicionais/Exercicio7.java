package PortoSeguro.Exercicios.LacoCondicionais;

import java.util.Scanner;

//https://docs.google.com/document/d/1vzfZJ4qXieoI6237qGo9up6biCr6LZFc

/* Receber valores de base e altura de um triângulo e 
 * verificar se são valores válidos (positivos maiores que zero). 
 * Em caso afirmativo, calcular a área do triângulo.
 * */

public class Exercicio7 {
	
	public static void main(String[] args) {
		// Criação de um scanner, usando System.in como input
		Scanner sc = new Scanner(System.in);
		
		// Lê a base do triângulo
		System.out.println("\nInsira o valor da base do triângulo: ");
		double base = sc.nextFloat();
		
		// Lê a altura do triângulo
		System.out.println("\nInsira o valor da altura do triângulo: ");
		double altura = sc.nextFloat();
		
		// Caso a base e a altura forem valores válidos
		if (base > 0.0 && altura > 0.0) {
			// Calcula a área do triângulo
			double area = (base * altura) / 2.0;
			
			// Mostra o valor da área
			System.out.printf("\nÁrea do triângulo de base %2.2f e altura %2.2f é %2.2f", base, altura, area);
		} else {
			// Caso a base não for válida, mostra uma mensagem
			if (base <= 0.0) {
				System.out.println("\nA base deve ser maior que zero.");
			}
			
			// Caso a altura não for válida, mostra uma mensagem
			if (altura <= 0.0) {
				System.out.println("\nA altura deve ser maior que zero.");
			}
		}
		
		// Fecha o scanner para não vazar recursos
		sc.close();
	}

}
