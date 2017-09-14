
public class SistemaDePedidos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Pratos pratoUm = new Pratos();
		Pratos pratoDois = new Pratos();
		Pratos pratoTres = new Pratos();
		
		
		//Contrução dos pratos
		pratoUm.setDescricaoDoPrato("arroz com feiujão");
		pratoUm.setPrecoDoPrato(15.0);
		
		pratoDois.setDescricaoDoPrato("Doce de Cana");
		pratoDois.setPrecoDoPrato(20.0);
		
		pratoTres.setDescricaoDoPrato("Sopa de galinha");
		pratoTres.setPrecoDoPrato(25.0);
		
		
		
	}

}
