package com.edu.iftm.exercicios3;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String palavra;
		int i, quant = 0;

		System.out.println("Insira uma palavra:");
		palavra = scan.next();
		scan.close();

		palavra = palavra.toLowerCase();
		for (i = 0; i < palavra.length(); i++) {
			if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'e' || palavra.charAt(i) == 'i' || palavra.charAt(i) == 'o' || palavra.charAt(i) == 'u')
				quant++;
		}

		System.out.println("A palavra " + palavra + " tem " + palavra.length() + " letras.");
		System.out.println("A palavra " + palavra + " tem " + quant + " vogais.");
		System.out.printf("A porcentagem de vogais em relação ao total de letras é de %.2f.", (float) quant / palavra.length() * 100);
	}

}