package br.inatel.dm102;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Musica musica1 = new Musica("Partiu rolê", 3);
		Musico musico1 = new Musico("Fabiano", "Animador de publico");
		Musica musica2 = new Musica("Rolê no alge", 3);
		Musico musico2 = new Musico("Karina", "Decoradora profissional");
		Musico musico3 = new Musico("Thalonha", "Promoter do rolê");
		Empresario empresario = new Empresario(12345544, "Dua Decora");

		Banda banda = new Banda(musico1, musica1, "Só rolê", "Todos");
		banda.empresario = empresario;
		banda.addMusica(musica2);
		banda.addMusico(musico2);
		banda.addMusico(musico3);

		banda.mostraInfos();

	}
}
