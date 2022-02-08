package PortoSeguro.Exercicios.LacoCondicionais;

import java.util.Scanner;

//https://docs.google.com/document/d/1vzfZJ4qXieoI6237qGo9up6biCr6LZFc

/* Elabore um sistema que dada a idade de um 
 * nadador classifique-o em uma das seguintes categorias:
 * Infantil A = 5 a 7 anos
 * Infantil B = 8 a 11 anos
 * Juvenil A = 12 a 13 anos
 * Juvenil B = 14 a 17 anos
 * Adultos = Maiores de 18 anos
 * */

public class Exercicio6 {
	
	public static void main(String[] args) {
		// Criação de um scanner, usando System.in como input
		Scanner sc = new Scanner(System.in);
		
		// Lê a idade do nadador
		System.out.println("\nInsira a idade: ");
		int idade = sc.nextInt();
		
		// Classificado na categoria Adultos
		if (idade >= 18) {
			System.out.println("\nCategoria Adultos");
		// Classificado na categoria Juvenil B
		} else if (idade >= 14) {
			System.out.println("\nCategoria Juvenil B");
		// Classificado na categoria Juvenil A
		} else if (idade >= 12) {
			System.out.println("\nCategoria Juvenil A");
		// Classificado na categoria Infantil B
		} else if (idade >= 8) {
			System.out.println("\nCategoria Infantil B");
		// Classificado na categoria Infantil A
		} else if (idade >= 5) {
			System.out.println("\nCategoria Infantil A");
		}
		
		// Fecha o scanner para não vazar recursos
		sc.close();
	}

}
