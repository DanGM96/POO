package com.edu.iftm.exercicios3;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String palavra;
		int i;

		System.out.println("Insira uma palavra:");
		palavra = scan.next();
		scan.close();

		for (i = 0; i < palavra.length(); i++) {
			System.out.println(palavra);
		}

	}

}
