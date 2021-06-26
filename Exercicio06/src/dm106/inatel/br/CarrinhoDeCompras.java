package dm106.inatel.br;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	String loginClientes = "";
	List<Ingresso> ingressos = new ArrayList<Ingresso>();;

	public CarrinhoDeCompras(String loginClientes, Ingresso ing) {
		super();
		ingressos.add(ing);
		this.loginClientes = loginClientes;
	}

	void addIngresso(Ingresso ing) {
		ingressos.add(ing);
	}

	void monstraDetalhesCompras() {
		System.out.println("Carrinho do cliente: " + loginClientes);
		for (Ingresso ingresso : ingressos) {
			ingresso.mostraInfos();
		}
	}

}
