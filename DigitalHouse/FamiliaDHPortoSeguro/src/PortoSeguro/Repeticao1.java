package PortoSeguro;

import java.util.Scanner;

public class Repeticao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1, n2, n3, media, somaMedia = 0, mediaGeral;

		Scanner sc = new Scanner(System.in);

		for (int x = 0; x < 5; x++) {
			System.out.println("\nInsira a primeira nota: ");
			n1 = sc.nextFloat();
			System.out.println("\nInsira a segunda nota: ");
			n2 = sc.nextFloat();
			System.out.println("\nInsira a terceira nota: ");
			n3 = sc.nextFloat();

			media = (n1 + n2 + n3) / 3;
			
			somaMedia = somaMedia + media;
		}
		
		mediaGeral = somaMedia / 5;
		
		System.out.printf("\nMedia geral é: %2.2f\n", mediaGeral);
	}
}
