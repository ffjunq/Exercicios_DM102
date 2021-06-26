package dm106.inatel.br;

public class Camarote extends Ingresso {
	String tamanhoCamiseta = "";

	public Camarote(String tamanhoCamiseta) {
		super();
		this.tamanhoCamiseta = tamanhoCamiseta;
	}

	@Override
	void mostraInfos() {
		// TODO Auto-generated method stub
		System.out.println("Tipo de compra: Camarote");
		System.out.println("Camiseta tamanho : " + tamanhoCamiseta);
		super.mostraInfos();
	}
}
