package com.edu.iftm.exercicios1;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		float saldo;

		System.out.println("Insira o saldo m�dio do cliente no �ltimo ano:");
		saldo = scanner.nextFloat();

		scanner.close();

		switch ((int) (saldo - 1) / 1000) {
		case 0:
			System.out.println("Nenhum cr�dito dispon�vel.");
			break;
		case 1:
		case 2:
		case 3:
			System.out.format("O cr�dito dispon�vel � de %.2f reais.\n", saldo * 0.2);
			break;
		case 4:
		case 5:
			System.out.format("O cr�dito dispon�vel � de %.2f reais.\n", saldo * 0.3);
			break;
		default:
			System.out.format("O cr�dito dispon�vel � de %.2f reais.\n", saldo * 0.4);
			break;
		}
	}
}
