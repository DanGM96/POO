package com.iftm.edu.br.poo;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		float raio;

		System.out.println("Insira o Raio do seu C�rculo.");
		raio = scan.nextFloat();
		scan.close();

		System.out.println("O Di�metro do C�rculo � " + (2 * raio) + " cm.");
		System.out.println("A �rea do C�rculo � " + (Math.pow(raio, 2) * Math.PI) + " cm�.");
		System.out.println("A Circunfer�ncia do C�rculo � " + (2 * raio * Math.PI) + " cm.");

	}

}