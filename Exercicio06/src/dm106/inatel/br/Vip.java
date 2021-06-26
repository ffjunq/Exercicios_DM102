package dm106.inatel.br;

public class Vip extends Ingresso {
	private String tamanhoAbada = "";
	private String tipo = "Vip";

	public Vip(String tamanhoAbada) {
		super();
		this.setTamanhoAbada(tamanhoAbada);
	}

	@Override
	void mostraInfos() {
		// TODO Auto-generated method stub
		System.out.println("Tipo de compra: " + getTipo());
		System.out.println("Abadá tamanho : " + getTamanhoAbada());
		super.mostraInfos();
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTamanhoAbada() {
		return tamanhoAbada;
	}

	public void setTamanhoAbada(String tamanhoAbada) {
		this.tamanhoAbada = tamanhoAbada;
	}

}
