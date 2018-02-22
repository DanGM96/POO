package com.edu.iftm.exercicios1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> pares = new ArrayList<String>();
		ArrayList<String> impares = new ArrayList<String>();
		Integer input;

		System.out.println("Insira numeros acima de 0 para comçar e 0 ou menos quando desejar finalizar");

		while (true) {
			if (!scanner.hasNextInt()) {
				System.out.println("Insira apenas numeros inteiros.");
				scanner.next();
				continue;
			}
			input = scanner.nextInt();
			if (input < 1)
				break;
			else if (input % 2 == 0)
				pares.add(input.toString());
			else
				impares.add(input.toString());

		}
		System.out.println(
				String.format("%d número(s) par(es), sendo eles { %s }", pares.size(), String.join(", ", pares)));
		System.out.println(String.format("%d número(s) ímpar(es) , sendo eles { %s }", impares.size(),
				String.join(", ", impares)));

		scanner.close();

	}
}
