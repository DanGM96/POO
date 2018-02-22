package com.edu.iftm.exercicios1;

import java.util.Scanner;

public class Ex05 {

	public class info {
		public String nome;
		public int idade;
	}

	public static void main(String[] args) {
		Ex05 ex5 = new Ex05();
		Scanner scanner = new Scanner(System.in);

		int i;
		info[] pessoa = new info[3];

		for (i = 0; i < 3; i++) {
			pessoa[i] = ex5.new info();

			System.out.println("Insira o nome da pessoa " + (i + 1) + ":");
			pessoa[i].nome = scanner.next();

			System.out.println("Insira a idade da pessoa " + (i + 1) + ":");
			pessoa[i].idade = scanner.nextInt();
		}

		info maisVelho = pessoa[0];
		info maisNovo = pessoa[0];
		for (i = 1; i < pessoa.length; i++) {
			if (pessoa[i].idade > maisVelho.idade) {
				maisVelho = pessoa[i];
			} else {
				if (pessoa[i].idade < maisNovo.idade) {
					maisNovo = pessoa[i];
				}
			}
		}

		scanner.close();

		System.out.println("A pessoa mais velha �: " + maisVelho.nome);
		System.out.println("A pessoa mais nova �: " + maisNovo.nome);
	}

}
