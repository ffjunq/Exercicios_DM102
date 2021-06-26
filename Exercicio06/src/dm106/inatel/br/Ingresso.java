package dm106.inatel.br;

import java.util.Date;

public class Ingresso {
	static long numberGenerator = 0;
	long number;
	private float valorIngresso = 50;
	private static float taxaCartao = 15.25f;
	private Date dataHoraCompra;

	float calculaTotalIngresso() {
		float total = valorIngresso + taxaCartao;

		return total;
	}

	void mostraInfos() {
		number = numberGenerator;
		numberGenerator++;
		this.dataHoraCompra = new Date();

		System.out.println("Número do ingresso: " + number);
		System.out.println("Data da compra: " + dataHoraCompra);
		System.out.println("Total a pagar = R$" + calculaTotalIngresso() + "\n");
	}
}
