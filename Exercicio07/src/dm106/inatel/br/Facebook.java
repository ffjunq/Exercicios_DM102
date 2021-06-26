package dm106.inatel.br;

public class Facebook extends RedeSocial implements Compartilhamento, VideoConferencia {

	public Facebook(String senha, int numAmigos) {
		super(senha, numAmigos);
	}

	@Override
	public void fazStreamings() {
		// TODO Auto-generated method stub
		System.out.println("Face Streaming");
	}

	@Override
	public void compartilhar() {
		// TODO Auto-generated method stub
		System.out.println("Compartilha no face");

	}

	@Override
	void postarFoto() {
		// TODO Auto-generated method stub
		System.out.println("Foto face");
	}

	@Override
	void postarVideo() {
		// TODO Auto-generated method stub
		System.out.println("Video face");
	}

	@Override
	void postarComentario() {
		// TODO Auto-generated method stub
		System.out.println("Comentário no face");
	}

	@Override
	void curtirPublicacao() {
		// TODO Auto-generated method stub
		super.curtirPublicacao();
	}
}
