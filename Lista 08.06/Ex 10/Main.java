package Ex11;

public class Main {

	public static void main(String[] args) {
		try {
			Pessoa p = new Pessoa ("Anthony", 12);
			System.out.println (p.toString());
		}
		catch (IllegalArgumentException e) {
			System.out.println (e.getMessage());
		}
	}

}
