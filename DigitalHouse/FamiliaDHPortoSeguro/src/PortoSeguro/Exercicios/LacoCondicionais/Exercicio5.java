package PortoSeguro.Exercicios.LacoCondicionais;

import java.util.Scanner;

//https://docs.google.com/document/d/1vzfZJ4qXieoI6237qGo9up6biCr6LZFc

/* A Secretaria de Meio Ambiente que controla o 
 * índice de poluição mantém 3 grupos de indústrias 
 * que são altamente poluentes do meio ambiente. 
 * O índice de poluição aceitável varia de 0,05 até 0,25. 
 * Se o índice sobe para 0,3 as indústrias do 1º grupo 
 * são intimadas a suspenderem suas atividades, se o índice 
 * crescer para 0,4 as industrias do 1º e 2º grupo são 
 * intimadas a suspenderem suas atividades, se o índice 
 * atingir 0,5 todos os grupos devem ser notificados a 
 * paralisarem suas atividades. Faça um sistema que leia 
 * o índice de poluição medido e emita a notificação adequada 
 * aos diferentes grupos de empresas.
 * */

public class Exercicio5 {
	
	public static void main(String[] args) {
		// Criação de um scanner, usando System.in como input
		Scanner sc = new Scanner(System.in);
		
		// Lê o índice de poluição
		System.out.println("\nInsira o índice de poluição: ");
		double ind = sc.nextFloat();
		
		// Caso for maior ou igual a 0.5, notifica todas as indústrias
		// a paralizar as atividades
		if (ind >= .5) {
			System.out.println("\nTodos as indústrias de todos os grupos devem paralizar suas atividades!");
		// Caso for maior ou igual a 0.4, notifica as indústrias do 1º e 2º grupo 
		// a paralizar as atividades
		} else if (ind >= .4) {
			System.out.println("\nAs indústrias do 1º e 2º grupo devem paralizar suas atividades!");
		// Caso for maior ou igual a 0.3, notifica as indústrias do 1º grupo 
		// a paralizar as atividades
		} else if (ind >= .3) {
			System.out.println("\nAs indústrias do 1º devem paralizar suas atividades!");
		}
		
		// Fecha o scanner para não vazar recursos
		sc.close();
	}

}
