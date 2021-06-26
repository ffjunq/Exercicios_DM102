package br.inatel.dm102;

import java.util.Date;
import java.util.List;

public class Robo {
	static long serialNumberGenerator = 0;
	long serialNumber;
	Processador processador;
	Corpo corpo;

	Robo(boolean temProcessador) {
		if (temProcessador) {
			this.processador = new Processador("AMD", 500.0f);
		}
		serialNumber = serialNumberGenerator++;
		this.corpo = new Corpo("Gordinho", "Rosa");
	}

	@Override
	public String toString() {
		String roboInfo = "";
		roboInfo += "Serial Number: " + this.serialNumber;
		roboInfo += "\n" + this.corpo.toString();
		if (processador != null) {
			roboInfo += "\n" + this.processador.toString();
		} else {
			roboInfo += "\n Sem processador.";
		}

		return roboInfo;
	}

	void mostraConfigRobo() {
		System.out.println(this.toString());
	}

}

class Processador {
	String marca;
	float frequenciaProcessamento;

	public Processador(String marca, float frequenciaProcessamento) {
		super();
		this.marca = marca;
		this.frequenciaProcessamento = frequenciaProcessamento;
	}

	@Override
	public String toString() {
		String processadorInfo = "";

		processadorInfo += "Marca do processador: " + this.marca;
		processadorInfo += "\nFrequancia de processamento: " + this.frequenciaProcessamento;

		return processadorInfo;
	}
}

class Corpo {
	String tipo;
	String cor;

	public Corpo(String tipo, String cor) {
		super();
		this.tipo = tipo;
		this.cor = cor;
	}

	@Override
	public String toString() {
		String corpoInfo = "";

		corpoInfo += "Tipo do corpo: " + this.tipo;
		corpoInfo += "\nCor do robo: " + this.cor;

		return corpoInfo;
	}
}

class Lote {
	static long lotNumberGenerator = 0;
	long lotNumber;
	Date dateCriacao = new Date();
	List<Robo> listaDeRobos;

	void mostraRobosLote() {
		System.out.println("Lot Number: " + lotNumber);
		System.out.println("\nData: " + dateCriacao);
		System.out.println("\nRobos: \n");
		if (this.listaDeRobos != null)
			listaDeRobos.forEach((robo) -> System.out.println(robo.toString()));
	}

	public Lote() {

		lotNumber = lotNumberGenerator++;
	}

}