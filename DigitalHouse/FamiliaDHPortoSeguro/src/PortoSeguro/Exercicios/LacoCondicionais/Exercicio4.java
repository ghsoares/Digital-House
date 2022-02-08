package PortoSeguro.Exercicios.LacoCondicionais;

import java.util.Scanner;

//https://docs.google.com/document/d/1vzfZJ4qXieoI6237qGo9up6biCr6LZFc

/* Faça um sistema que leia um número inteiro e mostre uma mensagem 
 * indicando se este número é par ou ímpar, e se é positivo ou 
 * negativo.
 * */

public class Exercicio4 {
	
	public static void main(String[] args) {
		// Criação de um scanner, usando System.in como input
		Scanner sc = new Scanner(System.in);
		
		// Lê o número
		System.out.println("\nInsira um número inteiro: ");
		int num = sc.nextInt();
		
		// Inicio da mensagem
		System.out.printf("\n%d ", num);
		
		// Par ou ímpar
		if (num % 2 == 0) System.out.print("é par ");
		else System.out.print("é ímpar ");
		
		// Positivo ou Negativo
		if (num >= 0) System.out.println("e positivo.");
		else System.out.println("e negativo.");
		
		// Fecha o scanner para não vazar recursos
		sc.close();
	}

}
