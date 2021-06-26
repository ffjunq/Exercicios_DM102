package dm106.inatel.br;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ingresso v = new Vip("GG");
		// v.mostraInfos();
		Ingresso c = new Camarote("G");
		// c.mostraInfos();
		Ingresso k = new Kids("123.123.123-12");
		// k.mostraInfos();

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras("João do pão", k);
		carrinho.addIngresso(c);
		carrinho.addIngresso(v);

		carrinho.monstraDetalhesCompras();
	}

}
