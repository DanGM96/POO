package com.edu.iftm.exercicios1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> frutas = new ArrayList<String>();
		String entrada;

		System.out
				.println("Insira o nome das frutas que você gosta e pressione enter. Digite \"zero\" quando terminar.");

		while (true) {
			entrada = scanner.nextLine();

			if (entrada.equals("zero")) {
				break;
			} else {
				frutas.add(entrada);
			}
		}
		System.out.println(frutas);
		scanner.close();
	}
}