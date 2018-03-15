package com.edu.iftm.exercicios3;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String palavra;
		int i;

		System.out.println("Insira uma palavra:");
		palavra = scan.next();
		scan.close();

		System.out.println("A palavra " + palavra + " tem " + palavra.length() + " letras.");
		for (i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
	}

}
