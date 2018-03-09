package com.edu.iftm.exercicios2;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n1, n2;

		System.out.println("Insira o 1º numero.");
		n1 = scan.nextInt();
		System.out.println("Insira o 2º numero.");
		n2 = scan.nextInt();
		scan.close();

		if (n1 % n2 == 0) {
			System.out.println(n1 + " é múltiplo de " + n2);
		} else {
			System.out.println(n1 + " não é múltiplo de " + n2);
		}
	}
}