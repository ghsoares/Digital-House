package PortoSeguro;

import java.util.Scanner;

public class CorrecaoDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nInsira um n�mero: ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.printf("\n%d � par", num);
		} else {
			System.out.printf("\n%d � �mpar", num);
		}
		
		if (num < 0) {
			System.out.printf("\n%d e negativo", num);
		} else {
			System.out.printf("\n%d � positivo", num);
		}
		
		sc.close();
	}

}
