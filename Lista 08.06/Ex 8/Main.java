package Ex8;

public class Main {

	public static void main(String[] args) {
		Produto l = new Livro ("50 Tons de cinza", 49.99, "Romance");
		System.out.println (l.toString());
		Produto cd = new CD ("Lover", 10.00, "Taylor Swift");
		System.out.println (cd.toString());
	}

}
