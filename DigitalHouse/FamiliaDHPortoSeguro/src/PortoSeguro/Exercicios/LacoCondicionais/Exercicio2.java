package PortoSeguro.Exercicios.LacoCondicionais;

import java.util.Scanner;

//https://docs.google.com/document/d/1vzfZJ4qXieoI6237qGo9up6biCr6LZFc

/* Elabore um sistema que leia as vari�veis C e N, 
 * respectivamente c�digo e n�mero de horas trabalhadas de 
 * um oper�rio. E calcule o sal�rio sabendo-se que ele ganha 
 * R$ 10,00 por hora. Quando o n�mero de horas exceder a 50 
 * calcule o excesso de pagamento armazenando-o na vari�vel E, 
 * caso contr�rio zerar tal vari�vel. A hora excedente de trabalho 
 * vale R$ 20,00. No final do processamento imprimir o sal�rio 
 * total e o sal�rio excedente.
 * */

public class Exercicio2 {
	
	public static void main(String[] args) {
		// Cria��o de um scanner, usando System.in como input
		Scanner sc = new Scanner(System.in);
		
		// Vari�vel C (C�digo) ser� uma string
		String C;
		
		// Vari�vel N (N�mero de horas) ser� um double
		double N;
		
		// L� o c�digo do funcion�rio
		System.out.println("\nInsira o c�digo do funcion�rio: ");
		C = sc.nextLine();
		
		// L� o n�mero de horas trabalhadas
		System.out.println("\nInsira o n�mero de horas trabalhadas: ");
		N = sc.nextFloat();
		
		// Calcula o sal�rio normal, multiplicando o
		// n�mero de horas por 10
		double salario = N * 10.0;
		
		// Calcula o sal�rio excendente pegando o resultado
		// de n�mero de horas trabalhadas menos 50, nunca sendo menor
		// que zero, e multiplica por 20
		double E = Math.max(N - 50.0, 0.0) * 20.0;
		
		// Adiciona o sal�rio excedente ao sal�rio total
		salario += E;
		
		// Mostra o sal�rio total e o sal�rio excedente
		System.out.printf("\nSal�rio total: R$%2.2f\n", salario);
		System.out.printf("\nSal�rio excedente: R$%2.2f\n", E);
		
		// Fecha o scanner para n�o vazar recursos
		sc.close();
	}

}
