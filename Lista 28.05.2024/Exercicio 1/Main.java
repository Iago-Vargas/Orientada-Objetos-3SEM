package Ex1;
import java.util.Scanner;
public class Main {
	public static void main (String [] src) {
		Scanner s = new Scanner (System.in);
		Produto p = new Produto ("Ozempic", 1023.99, 20);
		p.imprimir();
		
		ProdutoComDesconto pd = new ProdutoComDesconto ("Jarciance", 230.99, 20);
		pd.imprimir();
	}
}
