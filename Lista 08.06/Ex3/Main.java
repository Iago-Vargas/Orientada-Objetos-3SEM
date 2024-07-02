package Ex3;

public class Main {
	public static void main (String [] args) {
		Veiculo c = new Carro ("Fiat", "Uno", 1960);
		c.acelerar();
		c.frear();
		
		Veiculo m = new Moto ("Yamaha", "YBR", 2000);
		m.acelerar();
		m.frear();
	}
}
