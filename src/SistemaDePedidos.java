
public class SistemaDePedidos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//A ideia é que ao inicar a calss Restaurante o construtor inicie a class pratos que tem o construtor também.
		Restaurante pratosDoRestaurante;
		pratosDoRestaurante = new Restaurante();
		
		pratosDoRestaurante.mostrarCardapio();
		
		
		
	}

}
