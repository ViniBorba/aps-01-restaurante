import java.util.Scanner;

public class Pratos {
	
	Scanner scanner = new Scanner(System.in); 
	
	private String nomeDoPrato;
	private double precoDoPrato;
	private String descricaoDoPrato;
	
	Pratos(){
		System.out.print("Informe o valor do prato: ");
		precoDoPrato = scanner.nextDouble();
		
		System.out.print("Informe o nome do Prato: ");
		nomeDoPrato = scanner.nextLine();
	}
	
	//metodo set, que vai alterar o preco e a descricao dos pratos.
	public void setPrecoDoPrato(double precoDoPrato){
		this.precoDoPrato = precoDoPrato;
	}
	
	
	public void setDescricaoDoPrato(String descricaoDoPrato){
		this.descricaoDoPrato = descricaoDoPrato;
	}
	
	//metodo get que vai retornar os valores para serem impressos quando perguntados.
	public double getprecoDoPrato(){
		return precoDoPrato;
	}
	
	public String getDescricaoDoPrato(){
		return descricaoDoPrato;
	}

}