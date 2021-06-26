package br.inatel.dm102;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		ArrayList<Robo> robo = new ArrayList<Robo>();
		Lote lote1 = new Lote();
		Robo robo1 = new Robo(true);
		Robo robo2 = new Robo(false);
		Robo robo3 = new Robo(true);

		robo.add(robo1);
		robo.add(robo2);
		robo.add(robo3);
		lote1.listaDeRobos = robo;

		lote1.mostraRobosLote();
	}

}
