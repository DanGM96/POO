package com.edu.iftm.exercicios1;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		float salario = 10.25f;
		float horas;

		System.out.println("Informe a quantidade de horas trabalhadas a serem recebidas:");
		horas = scanner.nextFloat();

		System.out.println("O salario a ser recebido pelo funcionario e de " + (horas * salario) + " reais.");

		scanner.close();
	}

}
