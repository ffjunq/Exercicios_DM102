package br.inatel.dm102;

import java.util.ArrayList;
import java.util.List;

public class Banda {
	String nome;
	String genero;
	Empresario empresario;
	List<Musico> musicos;
	List<Musica> musicas;

	Banda(Musico musico, Musica musica, String nome, String genero) {
		this.nome = nome;
		this.genero = genero;
		musicos = new ArrayList<Musico>();
		musicas = new ArrayList<Musica>();

		this.addMusica(musica);
		this.addMusico(musico);
	}

	public void addMusica(Musica musica) {
		musicas.add(musica);
	}

	public void addMusico(Musico musico) {
		musicos.add(musico);
	}

	void mostraInfos() {
		System.out.println("Nome da banda: " + nome);
		System.out.println("Gênero da banda: " + genero);
		System.out.println("Musicos: ");
		musicos.forEach((musico) -> System.out.println(musico.toString()));
		System.out.println("Musicas: ");
		musicas.forEach((musica) -> System.out.println(musica.toString()));
		System.out.println(this.empresario != null ? this.empresario.toString() : "");
	}
}

class Empresario {
	long cnpj;
	String nome;

	public Empresario(long cnpj, String nome) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
	}

	@Override
	public String toString() {
		String empresarioInfo = "";

		empresarioInfo += "Nome do empresario: " + this.nome;
		empresarioInfo += "\nCNPJ do empresario: " + this.cnpj;

		return empresarioInfo;

	}
}

class Musica {
	String nome;
	int tempo;

	public Musica(String nome, int tempo) {
		super();
		this.nome = nome;
		this.tempo = tempo;
	}

	@Override
	public String toString() {
		String musicaInfo = "";

		musicaInfo += "Nome Musica: " + this.nome;
		musicaInfo += "\nDuração: " + this.tempo;

		return musicaInfo;
	}

}

class Musico {
	String nome;
	String funcao;

	public Musico(String nome, String funcao) {
		super();
		this.nome = nome;
		this.funcao = funcao;
	}

	@Override
	public String toString() {
		String musicoInfo = "";

		musicoInfo += "Nome do musico: " + this.nome;
		musicoInfo += "\nFunção na Banda: " + this.funcao;

		return musicoInfo;
	}
}