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
		System.out.println("\n2 - Subtra��o");
		System.out.println("\n3 - Multiplica��o");
		System.out.println("\n4 - Divis�o");
		System.out.println("\nEntre com a sua op��o: ");
		op = sc.nextInt();

		System.out.println("\nEntre com o primero n�mero: ");
		n1 = sc.nextFloat();
		System.out.println("\nEntre com o segundo n�mero: ");
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
		
		System.out.printf("\nO resultado �: %.2f", resultado);
	}

}
