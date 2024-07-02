package Ex3;

public class Carro extends Veiculo{
	public Carro (String marca, String modelo, int ano) {
		super (marca, modelo, ano);
	}
	
	public void acelerar () {
		System.out.println ("Carro { "+getMarca()+", Modelo: "+getModelo()+", Ano:"+getAno() +", ACELERANDO }");
	}
	public void frear () {
		System.out.println ("Carro { "+getMarca()+", Modelo: "+getModelo()+", Ano:"+getAno() +", FREANDO }");

	}
}
