package dm106.inatel.br;

public abstract class RedeSocial {
	protected String senha;
	protected int numAmigos;

	public RedeSocial(String senha, int numAmigos) {
		// TODO Auto-generated constructor stub
		super();
		this.senha = senha;
		this.numAmigos = numAmigos;
	}

	abstract void postarFoto();

	abstract void postarVideo();

	abstract void postarComentario();

	void curtirPublicacao() {
		System.out.println("Jóia!");
	}
}
