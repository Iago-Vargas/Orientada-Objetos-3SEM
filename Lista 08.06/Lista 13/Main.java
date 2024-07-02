package Ex14;

public class Main {

	public static void main(String[] args) {
		try {
			Agenda a = new Agenda ("Iago", "55996694531");
			System.out.println(a.toString());
		}
		catch (IllegalArgumentException e) {
			System.out.println ("Erro ao criar contato! "+e.getMessage());
		}
	}

}
