package PortoSeguro;

import java.util.Scanner;

public class OlaMundo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		int idade = 26;
		int numNotas = 4;
		double altura, media = 0f;

		Scanner leia = new Scanner(System.in);

		System.out.println("Olá mundo!");

		System.out.println("\nEntre com o seu nome: ");
		nome = leia.nextLine();
		System.out.println("\nEntre com a sua idade: ");
		idade = leia.nextInt();
		System.out.println("\nEntre com a sua altura: ");
		altura = leia.nextFloat();

		System.out.println("\nMeu nome é: " + nome + " eu tenho: " + idade + " anos e eu meço: " + altura + "m");

		for (int i = 0; i < numNotas; i++) {
			System.out.printf("\nInsira a nota %d: ", i + 1);
			media += leia.nextFloat();
		}

		media /= numNotas;

		System.out.printf("\nMédia aritmética: %2.2f", media);

		if (media >= 7 && media <= 10) {
			System.out.println("\nAluno aprovado!");
		} else if (media >= 5 && media < 7) {
			System.out.println("\nAluno de exame!");
		} else if (media >= 0 && media < 5) {
			System.out.println("\nAluno de reprovado!");
		} else {
			System.out.println("\nMédia inválida!");
		}

		leia.close();
	}
}
