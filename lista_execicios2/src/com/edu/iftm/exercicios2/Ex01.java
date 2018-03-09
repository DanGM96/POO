package com.edu.iftm.exercicios2;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		float med = 0;
		int temp, i;
		int[] num = new int[3];

		for (i = 0; i < 3; i++) {
			System.out.println("Insira o " + (i + 1) + "º numero.");
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
		System.out.println("O maior número é " + temp + ".");

		if (num[0] < num[1] & num[0] < num[2]) {
			temp = num[0];
		} else {
			if (num[1] < num[2]) {
				temp = num[1];
			} else {
				temp = num[2];
			}
		}
		System.out.println("O menor número é " + temp + ".");

		temp = num[0] * num[1] * num[2];
		System.out.println("O produto dos três números é " + temp + ".");

		med = (num[0] + num[1] + num[2]) / (float) 3;
		System.out.printf("A média dos três números é %.2f.", med);
	}
}