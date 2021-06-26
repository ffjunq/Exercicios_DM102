package br.inatel.dm102;

import java.util.Random;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		boolean acertou = false;
		// instância um objeto da classe Random usando o construtor padrão
		Random gerador = new Random();

		// Gera um numero aleatório de 0 a 10
		int number = gerador.nextInt(10) + 1;

		// intância um obj da classe Scanner e permite entrada de dados
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com um valor de 1 a 10: ");
		do {
			int myInterger = scanner.nextInt();
			if (myInterger == number) {
				System.out.println("Parabés você acertou o numero: " + number);
				acertou = true;
			}
		} while (acertou == false);

	}
}