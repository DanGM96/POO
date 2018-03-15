package com.edu.iftm.exercicios3;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int i, idade, menor = 0, maior = 0;

		for (i = 0; i < 10; i++) {
			System.out.println("Insira a idade da " + (i + 1) + "ª pessoa:");
			idade = scan.nextInt();
			if (idade == 0) {
				break;
			}
			if (idade < 21) {
				menor++;
			}
			if (idade > 50) {
				maior++;
			}

		}
		scan.close();

		System.out.println("Há " + menor + " pessoas com menos de 21 anos.");
		System.out.println("Há " + maior + " pessoas com mais de 50 anos.");

	}

}
