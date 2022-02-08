package PortoSeguro.Exercicios.LacoCondicionais;

import java.util.Scanner;

//https://docs.google.com/document/d/1vzfZJ4qXieoI6237qGo9up6biCr6LZFc

/* Desenvolva um sistema em que:
 * 1. Leia 4 (quatro) números;
 * 2. Calcule o quadrado de cada um;
 * 3. Se o valor resultante do quadrado do terceiro for >= 1000, 
 * 		imprima-o e finalize;
 * 4. Caso contrário, imprima os valores lidos e seus respectivos 
 * 		quadrados.
 * */

public class Exercicio3 {
	
	public static void main(String[] args) {
		// Criação de um scanner, usando System.in como input
		Scanner sc = new Scanner(System.in);
		
		// Criação dos três números como variáveis
		double n1, n2, n3, n4;
		
		// Lê os números
		System.out.println("\nInsira o primeiro número: ");
		n1 = sc.nextFloat();
		
		System.out.println("\nInsira o segundo número: ");
		n2 = sc.nextFloat();
		
		System.out.println("\nInsira o terceiro número: ");
		n3 = sc.nextFloat();
		
		System.out.println("\nInsira o quarto número: ");
		n4 = sc.nextFloat();
		
		// Calcula o quadrado de cada número e salva em
		// uma variável para cada
		double n1sq = Math.pow(n1, 2);
		double n2sq = Math.pow(n2, 2);
		double n3sq = Math.pow(n3, 2);
		double n4sq = Math.pow(n4, 2);
		
		// Caso o quadrado do terceiro
		// número for >= 1000, apenas imprima ele
		if (n3sq >= 1000.0) {
			System.out.printf("\nQuadrado do terceiro número é: %2.2f\n", n3sq);
		}
		// Caso contrário, imprima os valores lidos e seus respectivos
		// quadrados
		else {
			System.out.printf("\nO quadrado do número %2.2f é %2.2f", n1, n1sq);
			System.out.printf("\nO quadrado do número %2.2f é %2.2f", n2, n2sq);
			System.out.printf("\nO quadrado do número %2.2f é %2.2f", n3, n3sq);
			System.out.printf("\nO quadrado do número %2.2f é %2.2f", n4, n4sq);
		}
		
		// Fecha o scanner para não vazar recursos
		sc.close();
	}

}
