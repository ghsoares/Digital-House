package PortoSeguro.Exercicios.LacoCondicionais;

import java.util.Scanner;

//https://docs.google.com/document/d/1vzfZJ4qXieoI6237qGo9up6biCr6LZFc

/* João Papo-de-Pescador, homem de bem, comprou um microcomputador 
 * para controlar o rendimento diário de seu trabalho. Toda vez que 
 * ele traz um peso de tomate maior que o estabelecido pelo 
 * regulamento do estado de São Paulo (50 quilos) deve pagar um 
 * multa de R$ 4,00 por quilo excedente. João precisa que você 
 * faça um sistema que leia a variável P (peso de tomates) e 
 * verifique se há excesso. Se houver, gravar na variável E (Excesso) 
 * e na variável M o valor da multa que João deverá pagar. 
 * Caso contrário mostrar tais variáveis com o conteúdo ZERO.
 * */

public class Exercicio1 {
	
	public static void main(String[] args) {
		// Criação de um scanner, usando System.in como input
		Scanner sc = new Scanner(System.in);
		
		// Declaração das variáveis:
		// p (Peso);
		// e (Excesso em kg);
		// m (Multa em R$)
		double P, E, M;
		
		// Recebe o input do usuário do peso
		System.out.println("\nInsira o peso de tomates:");
		P = sc.nextFloat();
		
		// Calcula o excesso, pega o peso, subtrai pelo peso máximo de
		// 50 kg, e calcula o valor máximo entre esse cálculo e zero,
		// ou seja, o resultado nunca vai ser menor que zero.
		E = Math.max(P - 50, 0);
		
		// Calcula a multa, multiplicando o excesso por 4
		M = E * 4;
		
		// Mostra o excesso em kg e multa em R$
		System.out.printf("\nExcesso: %2.2f kg\n", E);
		System.out.printf("\nMulta: R$%2.2f", M);
		
		// Fecha o scanner para não vazar recursos
		sc.close();
	}

}
