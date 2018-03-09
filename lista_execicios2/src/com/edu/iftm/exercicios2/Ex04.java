package com.edu.iftm.exercicios2;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char simbolo;

		System.out.println("Tabela ASCII");
		System.out.println("Insira apenas um Caractere.");
		simbolo = scan.next().charAt(0);
		scan.close();

		System.out.println(simbolo + " = " + (int) simbolo);

	}

}