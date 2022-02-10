package PortoSeguro.Exercicios.LacoCondicionais2;

import java.util.Scanner;

//https://docs.google.com/document/d/19gzH_8SXJIlFfUllLvaraPEZytF6wWH7

/* Uma empresa desenvolveu uma pesquisa para saber as características psicológicas 
 * dos indivíduos de uma região. Para tanto, a cada uma das pessoas era perguntado: 
 * idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções 
 * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, 
 * calcule e mostre: (WHILE)
 * o número de pessoas calmas; 
 * o número de mulheres nervosas; 
 * o número de homens agressivos; 
 * o número de outros calmos;
 * o número de pessoas nervosas com mais de 40 anos; 
 * o número de pessoas calmas com menos de 18 anos.
 * */

public class Exercicio4 {

	public static void main(String[] args) {
		// Criação de um scanner, usando System.in como input
		Scanner sc = new Scanner(System.in);

		int calmas = 0, mulNerv = 0, homAgr = 0, outCalmos = 0, gt40 = 0, lt18 = 0;

		// For loop, i tem o range de [0,150)
		for (int i = 0; i < 150; i++) {
			// Input idade do usuário
			System.out.println("\nInsira a idade: ");
			int idade = sc.nextInt();
			
			// Espera input válido
			while (idade <= 0) {
				System.out.println("\nIdade deve ser maior que zero! ");
				System.out.println("\nInsira a idade: ");
				idade = sc.nextInt();
			}

			// Input sexo do usuário
			System.out.println("\nInsira o sexo (1-feminino / 2-masculino / 3-Outros): ");
			int sexo = sc.nextInt();
			
			// Espera input válido
			while (sexo <= 0 || sexo > 3) {
				System.out.println("\nOpção inválida! ");
				System.out.println("\nInsira o sexo (1-feminino / 2-masculino / 3-Outros): ");
				sexo = sc.nextInt();
			}
			
			// Input estado mental do usuário
			System.out.println("\nInsira: ");
			System.out.println("\n\t1 - Se for calmo(a);");
			System.out.println("\n\t2 - Se for nervoso(a);");
			System.out.println("\n\t3 - Se for agressivo(a)");
			int op = sc.nextInt();

			// Espera input válido
			while (op <= 0 || op > 3) {
				System.out.println("\nOpção inválida! ");
				System.out.println("\nInsira: ");
				System.out.println("\n\t1 - Se for calmo(a);");
				System.out.println("\n\t2 - Se for nervoso(a);");
				System.out.println("\n\t3 - Se for agressivo(a)");
				op = sc.nextInt();
			}
			
			// Um monte de ifs
			if (op == 1)
				calmas++;
			if (sexo == 1 && op == 2)
				mulNerv++;
			if (sexo == 2 && op == 3)
				homAgr++;
			if (sexo == 3 && op == 1)
				outCalmos++;
			if (idade > 40 && op == 2)
				gt40++;
			if (idade < 18 && op == 1)
				lt18++;
		}
		
		System.out.println("\n--Relatório:--");
		System.out.printf("\n%d Pessoas são calmas.\n", calmas);
		System.out.printf("\n%d Mulheres são nervosas.\n", mulNerv);
		System.out.printf("\n%d Homens são agressivos.\n", homAgr);
		System.out.printf("\n%d Outros são calmos.\n", outCalmos);
		System.out.printf("\n%d Pessoas são nervosas e têm mais de 40 anos.\n", gt40);
		System.out.printf("\n%d Pessoas são calmas e têm menos de 18 anos.\n", lt18);

		// Fecha o scanner para não vazar recursos
		sc.close();
	}

}
