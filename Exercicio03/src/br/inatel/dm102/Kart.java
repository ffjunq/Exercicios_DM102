package br.inatel.dm102;

public class Kart {

	String nome;
	Piloto piloto; // Agregado em Kart
	Motor motor;

	/* Construtor para uma composição do Kart. */
	public Kart() {
		motor = new Motor();
	}

	void pular() {
		System.out.println("Pula");
	}

	void soltarTurbo() {
		System.out.println("Solta turbo");
	}

	void fazerDrift() {
		System.out.println("Faz drift");
	}

	void mostraInfosKart() {

		System.out.println("Nome do Piloto: " + piloto.nome);
		System.out.println("O Piloto é um vilão? " + ((piloto.vilao) ? "Sim." : "Não"));
		System.out.println("O motor do kart é de " + motor.cilindradas + " cilindradas");
		System.out.println("A velocidade máxima do kart é de " + motor.velocidadeMax + " km/h");
	}

}

class Motor {
	String cilindradas;
	int velocidadeMax;
}

class Jogador {

	String nome;
}

class Piloto {

	String nome;
	boolean vilao;

	void soltaPoder() {
		System.out.println("Solta poder");
	}

}
