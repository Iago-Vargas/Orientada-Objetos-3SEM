package Ex12;

public class Main {

	public static void main(String[] args) {
		try {
			Data d = new Data (25, 02, 2023);
			System.out.println(d.toString());
		}
		catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

		}
	}

}
