package com.edu.iftm.exercicios2;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		float med = 0;
		int temp, i;
		int[] num = new int[3];

		for (i = 0; i < 3; i++) {
			System.out.println("Insira o " + (i + 1) + "� numero.");
			num[i] = scan.nextInt();
		}
		scan.close();

		if (num[0] > num[1] & num[0] > num[2]) {
			temp = num[0];
		} else {
			if (num[1] > num[2]) {
				temp = num[1];
			} else {
				temp = num[2];
			}
		}
		System.out.println("O maior n�mero � " + temp + ".");

		if (num[0] < num[1] & num[0] < num[2]) {
			temp = num[0];
		} else {
			if (num[1] < num[2]) {
				temp = num[1];
			} else {
				temp = num[2];
			}
		}
		System.out.println("O menor n�mero � " + temp + ".");

		temp = num[0] * num[1] * num[2];
		System.out.println("O produto dos tr�s n�meros � " + temp + ".");

		med = (num[0] + num[1] + num[2]) / (float) 3;
		System.out.printf("A m�dia dos tr�s n�meros � %.2f.", med);
	}
}