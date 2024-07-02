package Ex3;

public class Moto extends Veiculo{
	public Moto (String modelo, String marca, int ano) {
		super (marca, modelo, ano);
	}
	
	public void acelerar () {
		System.out.println ("Moto { "+getMarca()+", Modelo: "+getModelo()+", Ano:"+getAno() +", ACELERANDO }");

	}
	public void frear () {
		System.out.println ("Moto { "+getMarca()+", Modelo: "+getModelo()+", Ano:"+getAno() +", FREANDO }");

	}
}
