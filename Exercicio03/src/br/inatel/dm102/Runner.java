package br.inatel.dm102;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int VEL_MAX = 150;
		final int VEL_MIN = 0;
		Jogador jogador = new Jogador();
		Kart kart = new Kart();
		Piloto piloto = new Piloto();
		String vilao;
		String cilindradas;
		int velMaxima = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Entre com o nome do Jogador:");
		jogador.nome = input.next();
		System.out.println("Entre com o nome do kart:");
		kart.nome = input.next();
		System.out.println("Ente com o nome do piloto:");
		piloto.nome = input.next();

		do {
			System.out.println("O piloto é um vilão? S ou N");
			vilao = input.next();

			if (vilao.intern() == "S") {

				piloto.vilao = true;

			} else if (vilao.intern() == "N") {

				piloto.vilao = false;

			} else {

				System.out.println("Entre com S ou N");
			}

		} while (!(vilao.equals("S")) && !(vilao.equals("N")));

		kart.piloto = piloto;

		System.out.println("Entre com o as cilindradas do motor: ");
		cilindradas = input.next();
		if ((cilindradas.equals("50")) || (cilindradas.equals("100")) || (cilindradas.equals("150"))) {

			kart.motor.cilindradas = cilindradas;

		} else {
			kart.motor.cilindradas = null;
		}

		System.out.println("Entre com a velocidade máxima do kart:");
		velMaxima = input.nextInt();

		if ((velMaxima >= VEL_MIN) && (velMaxima <= VEL_MAX)) {

			kart.motor.velocidadeMax = velMaxima;
		} else {

			kart.motor.velocidadeMax = VEL_MIN;
		}

		kart.pular();
		kart.soltarTurbo();
		kart.fazerDrift();
		kart.piloto.soltaPoder();
		kart.mostraInfosKart();

		input.close();
	}

}
