package com.edu.iftm.exercicios1;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		float h, b, B;

		System.out.println("Insira a Altura:");
		h = scanner.nextFloat();

		System.out.println("Insira a Base Menor:");
		b = scanner.nextFloat();

		System.out.println("Insira a Base Maior:");
		B = scanner.nextFloat();

		scanner.close();
		System.out.println("A área é: " + (h * (b + B)) / 2);
	}

}