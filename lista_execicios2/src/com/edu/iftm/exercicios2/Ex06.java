package com.edu.iftm.exercicios2;

import java.util.Scanner;

public class Ex06 {

	public static void secundariaNao(char[][] matriz, int lin, int col) {

		int i, j;

		System.out.println("Matriz sem a diagonal secundária.");
		for (i = 0; i < lin; i++) {
			for (j = 0; j < col; j++) {
				if (i + j != lin - 1) {
					System.out.print("[" + matriz[i][j] + "]");
				} else {
					System.out.print("[ ]");
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int i, j;
		char[][] matriz = new char[10][10];
		int lin = matriz.length;
		int col = matriz[0].length;

		for (i = 0; i < lin; i++) {
			for (j = 0; j < col; j++) {
				System.out.println("Insira o elemento [" + i + "][" + j + "]");
				matriz[i][j] = scan.next().charAt(0);
			}
		}
		scan.close();

		secundariaNao(matriz, lin, col);

	}
}
