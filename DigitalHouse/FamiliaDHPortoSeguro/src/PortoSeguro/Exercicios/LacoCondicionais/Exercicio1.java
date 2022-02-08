package PortoSeguro.Exercicios.LacoCondicionais;

import java.util.Scanner;

//https://docs.google.com/document/d/1vzfZJ4qXieoI6237qGo9up6biCr6LZFc

/* Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador 
 * para controlar o rendimento di�rio de seu trabalho. Toda vez que 
 * ele traz um peso de tomate maior que o estabelecido pelo 
 * regulamento do estado de S�o Paulo (50 quilos) deve pagar um 
 * multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� 
 * fa�a um sistema que leia a vari�vel P (peso de tomates) e 
 * verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) 
 * e na vari�vel M o valor da multa que Jo�o dever� pagar. 
 * Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.
 * */

public class Exercicio1 {
	
	public static void main(String[] args) {
		// Cria��o de um scanner, usando System.in como input
		Scanner sc = new Scanner(System.in);
		
		// Declara��o das vari�veis:
		// p (Peso);
		// e (Excesso em kg);
		// m (Multa em R$)
		double P, E, M;
		
		// Recebe o input do usu�rio do peso
		System.out.println("\nInsira o peso de tomates:");
		P = sc.nextFloat();
		
		// Calcula o excesso, pega o peso, subtrai pelo peso m�ximo de
		// 50 kg, e calcula o valor m�ximo entre esse c�lculo e zero,
		// ou seja, o resultado nunca vai ser menor que zero.
		E = Math.max(P - 50, 0);
		
		// Calcula a multa, multiplicando o excesso por 4
		M = E * 4;
		
		// Mostra o excesso em kg e multa em R$
		System.out.printf("\nExcesso: %2.2f kg\n", E);
		System.out.printf("\nMulta: R$%2.2f", M);
		
		// Fecha o scanner para n�o vazar recursos
		sc.close();
	}

}
