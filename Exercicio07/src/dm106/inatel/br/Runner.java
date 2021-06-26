package dm106.inatel.br;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facebook face = new Facebook("123abc", 8);

		face.fazStreamings();
		face.compartilhar();
		face.postarFoto();
		face.postarComentario();
		face.postarVideo();
		face.curtirPublicacao();

	}

}
