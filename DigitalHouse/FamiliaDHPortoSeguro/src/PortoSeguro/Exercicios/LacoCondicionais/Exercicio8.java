package PortoSeguro.Exercicios.LacoCondicionais;

import java.util.Scanner;

//https://docs.google.com/document/d/1vzfZJ4qXieoI6237qGo9up6biCr6LZFc

/* Construa um sistema para ler uma variável numérica N e 
 * imprimi-la somente se a mesma for maior que 100, 
 * caso contrário imprimi-la com o valor zero.
 * */

public class Exercicio8 {
	
	public static void main(String[] args) {
		// Criação de um scanner, usando System.in como input
		Scanner sc = new Scanner(System.in);
		
		// Lê o número N
		System.out.println("\nInsira um número: ");
		double N = sc.nextFloat();
		
		// Caso o número for menor ou igual a 100.0, muda
		// o número para 0.0
		if (N <= 100.0) {
			N = 0.0;
		}
		
		// Mostra o número
		System.out.printf("\nO número é: %2.2f", N);
		
		// Fecha o scanner para não vazar recursos
		sc.close();
	}

}
