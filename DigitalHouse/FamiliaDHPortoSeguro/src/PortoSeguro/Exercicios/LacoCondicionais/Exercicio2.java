package PortoSeguro.Exercicios.LacoCondicionais;

import java.util.Scanner;

//https://docs.google.com/document/d/1vzfZJ4qXieoI6237qGo9up6biCr6LZFc

/* Elabore um sistema que leia as variáveis C e N, 
 * respectivamente código e número de horas trabalhadas de 
 * um operário. E calcule o salário sabendo-se que ele ganha 
 * R$ 10,00 por hora. Quando o número de horas exceder a 50 
 * calcule o excesso de pagamento armazenando-o na variável E, 
 * caso contrário zerar tal variável. A hora excedente de trabalho 
 * vale R$ 20,00. No final do processamento imprimir o salário 
 * total e o salário excedente.
 * */

public class Exercicio2 {
	
	public static void main(String[] args) {
		// Criação de um scanner, usando System.in como input
		Scanner sc = new Scanner(System.in);
		
		// Variável C (Código) será uma string
		String C;
		
		// Variável N (Número de horas) será um double
		double N;
		
		// Lê o código do funcionário
		System.out.println("\nInsira o código do funcionário: ");
		C = sc.nextLine();
		
		// Lê o número de horas trabalhadas
		System.out.println("\nInsira o número de horas trabalhadas: ");
		N = sc.nextFloat();
		
		// Calcula o salário normal, multiplicando o
		// número de horas por 10
		double salario = N * 10.0;
		
		// Calcula o salário excendente pegando o resultado
		// de número de horas trabalhadas menos 50, nunca sendo menor
		// que zero, e multiplica por 20
		double E = Math.max(N - 50.0, 0.0) * 20.0;
		
		// Adiciona o salário excedente ao salário total
		salario += E;
		
		// Mostra o salário total e o salário excedente
		System.out.printf("\nSalário total: R$%2.2f\n", salario);
		System.out.printf("\nSalário excedente: R$%2.2f\n", E);
		
		// Fecha o scanner para não vazar recursos
		sc.close();
	}

}
