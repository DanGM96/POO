package com.edu.iftm.exercicios1;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		float valorInicial, valorFinal;
		float distribuidor = 0.28f;
		float imposto = 0.45f;

		System.out.println("Insira o custo do ve�culo para a f�brica: ");
		valorInicial = scanner.nextFloat();

		valorFinal = valorInicial + (valorInicial * distribuidor) + (valorInicial * imposto);

		scanner.close();
		System.out.println("O custo do ve�culo para o consumidor � de " + valorFinal + " reais.");
	}

}
