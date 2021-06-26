package dm106.inatel.br;

public class Kids extends Vip {
	String responsavel = "";

	@Override
	float calculaTotalIngresso() {
		// TODO Auto-generated method stub
		return super.calculaTotalIngresso() / 2;
	}

	public Kids(String responsavel) {
		super(responsavel);
		setTamanhoAbada("P");
		setTipo("Vip Kids");
		this.responsavel = responsavel;
	}

	@Override
	void mostraInfos() {
		// TODO Auto-generated method stub
		System.out.println("Responsável: " + responsavel);
		super.mostraInfos();
	}
}
