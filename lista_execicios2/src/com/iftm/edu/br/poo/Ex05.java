package com.iftm.edu.br.poo;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] numero = new int[12];
		int i, menor = 0, maior = 0;

		for (i = 0; i < 12; i++) {
			System.out.println("Insira o " + (i + 1) + "� n�mero:");
			numero[i] = scan.nextInt();
		}
		scan.close();

		for (i = 0; i < 12; i++) {
			if (numero[i] < 8) {
				menor++;
			}
			if (numero[i] > 10) {
				maior++;
			}
		}
		System.out.printf("Porcentagem de n�meros menores que 8: %.2f%%", ((float) menor / 12 * 100));
		System.out.printf("\nPorcentagem de n�meros maiores que 10: %.2f%%", ((float) maior / 12 * 100));

	}
}