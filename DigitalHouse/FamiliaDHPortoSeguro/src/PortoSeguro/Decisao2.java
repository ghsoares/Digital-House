package PortoSeguro;

import java.util.Scanner;

public class Decisao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1, n2, resultado = 0f;
		int op;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\t\tCalculadora");
		System.out.println("\n1 - Soma");
		System.out.println("\n2 - Subtração");
		System.out.println("\n3 - Multiplicação");
		System.out.println("\n4 - Divisão");
		System.out.println("\nEntre com a sua opção: ");
		op = sc.nextInt();

		System.out.println("\nEntre com o primero número: ");
		n1 = sc.nextFloat();
		System.out.println("\nEntre com o segundo número: ");
		n2 = sc.nextFloat();

		switch (op) {
		case 1: {
			resultado = n1 + n2;
			break;
		}
		case 2: {
			resultado = n1 - n2;
			break;
		}
		case 3: {
			resultado = n1 * n2;
			break;
		}
		case 4: {
			resultado = n1 / n2;
			break;
		}
		}
		
		System.out.printf("\nO resultado é: %.2f", resultado);
	}

}
