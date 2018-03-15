package com.edu.iftm.exercicios3;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] vetUm = new int[3];
		int[] vetDois = new int[3];
		int i, somaUm = 0, somaDois = 0;
		float mediaUm, mediaDois;

		for (i = 0; i < vetUm.length; i++) {
			System.out.println("Insira um valor para o VetorUm[" + i + "]");
			vetUm[i] = scan.nextInt();
		}
		for (i = 0; i < vetDois.length; i++) {
			System.out.println("Insira um valor para o VetorDois[" + i + "]");
			vetDois[i] = scan.nextInt();
		}
		scan.close();

		System.out.print("VetorUm{");
		for (i = 0; i < vetUm.length; i++) {
			System.out.print(vetUm[i]);
			if (i < vetUm.length - 1) {
				System.out.print(",");
			}
			somaUm += vetUm[i];
		}
		System.out.println("}");
		System.out.print("VetorDois{");
		for (i = 0; i < vetDois.length; i++) {
			System.out.print(vetDois[i]);
			if (i < vetUm.length - 1) {
				System.out.print(",");
			}
			somaDois += vetDois[i];
		}
		System.out.println("}");

		System.out.println("\nA soma dos valores do VetorUm é de " + somaUm);
		System.out.println("A soma dos valores do VetorDois é de " + somaDois);

		mediaUm = (float) somaUm / vetUm.length;
		mediaDois = (float) somaDois / vetDois.length;
		System.out.printf("\nA média dos valores do VetorUm é de %.2f", mediaUm);
		System.out.printf("\nA média dos valores do VetorDois é de %.2f", mediaDois);

		System.out.printf("\n\nA soma das médias dos dois Vetores é de %.2f", (mediaUm + mediaDois));
		System.out.printf("\nA média das médias dos dois Vetores é de %.2f", ((mediaUm + mediaDois) / 2));
	}

}
