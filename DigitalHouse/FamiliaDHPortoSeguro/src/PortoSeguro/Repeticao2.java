package PortoSeguro;

import java.util.Scanner;

public class Repeticao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tabuada, x = 1, resultado;

		Scanner sc = new Scanner(System.in);

		System.out.println("\nInsira qual tabuada deseja montar: ");
		tabuada = sc.nextInt();

		do {
			resultado = x * tabuada;
			System.out.printf("\n%d X %d = %d", tabuada, x, resultado);
			x++;
		} while (x <= 10);

		sc.close();
	}

}
