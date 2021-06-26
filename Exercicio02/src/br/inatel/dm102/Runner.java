package br.inatel.dm102;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com qual o numero deseja fazer a tabuada!");
		int tabuada = scanner.nextInt();

		System.out.println("Entre com o menor valor que deseja fazer a multiplicação!");
		int min = scanner.nextInt();

		System.out.println("Entre com o maior valor que deseja fazer a multiplicação!");
		int max = scanner.nextInt();

		System.out.println("Tabuada do: " + tabuada);
		for (int i = min; i <= max; i++) {
			System.out.print(i + " x " + tabuada + " = ");
			System.out.println(i * tabuada);
		}
	}
}