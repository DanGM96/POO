package com.edu.iftm.exercicios1;

import java.util.Scanner;
import java.util.Vector;

public class Ex09 {

	public class dados {
		public String nome;
		public byte idade;
		public float peso;
	}

	public static void main(String[] args) {

		Ex09 ex9 = new Ex09();
		Scanner scanner = new Scanner(System.in);
		String entradaNome;
		Vector<dados> pessoas = new Vector<dados>();
		dados pessoaAtual = null;

		System.out.println("Insira nome, idade e peso de cada pessoa. Para finalizar, digite \"fim\"");

		while (true) {

			System.out.println("Insira o nome da pessoa: ");
			entradaNome = scanner.nextLine();
			if (entradaNome.equals("fim"))
				break;

			pessoaAtual = ex9.new dados();
			pessoaAtual.nome = entradaNome;

			System.out.println("Insira a idade da pessoa: ");
			pessoaAtual.idade = Byte.parseByte(scanner.nextLine());

			System.out.println("Insira o peso da pessoa: ");
			pessoaAtual.peso = Float.parseFloat(scanner.nextLine());

			pessoas.add(pessoaAtual);
		}
		scanner.close();

		for (dados pessoa : pessoas) {
			System.out.println("Nome: " + pessoa.nome);
			System.out.println("Idade: " + pessoa.idade);
			System.out.println("Peso: " + pessoa.peso);
		}
	}
}