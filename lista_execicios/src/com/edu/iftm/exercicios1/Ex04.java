package com.edu.iftm.exercicios1;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] nomes = new String[5];
		int i;

		System.out.println("Informe 5 nomes:");
		for (i = 0; i < nomes.length; i++) {
			nomes[i] = scanner.nextLine();
		}

		System.out.println("Nomes inseridos, de tr�s para frente: ");
		for (i = nomes.length - 1; i >= 0; i--) {
			System.out.println(nomes[i]);
		}
		scanner.close();

	}

}
