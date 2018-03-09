package com.iftm.edu.br.poo;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		float raio;

		System.out.println("Insira o Raio do seu Círculo.");
		raio = scan.nextFloat();
		scan.close();

		System.out.println("O Diâmetro do Círculo é " + (2 * raio) + " cm.");
		System.out.println("A Área do Círculo é " + (Math.pow(raio, 2) * Math.PI) + " cm².");
		System.out.println("A Circunferência do Círculo é " + (2 * raio * Math.PI) + " cm.");

	}

}