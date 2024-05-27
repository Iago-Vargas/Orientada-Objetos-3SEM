package Ex11;
import java.util.ArrayList;
import java.util.List;

public class Mani {
	public static void main (String [] args) {
		List<Livro> lv= new ArrayList <>();
		
		lv.add(new Livro("Romance", "Iago", 3000));
		lv.add(new Livro("Ficção Científica", "Ana", 2000));
	    lv.add(new Livro("História", "Carlos", 2022));
	    lv.add(new Livro("Biografia", "Mariana", 2018));
		
	    int menor = 0;
        int maior = 0;
		
		for (Livro livro : lv) {
			if(livro.getAno() < menor) {
				menor = livro.getAno();
			}
			if (livro.getAno() > maior) {
				maior = livro.getAno();
			}
		}
		System.out.println ("Livro de maior ano: "+maior);
		System.out.println ("Livro de menor ano: "+menor);
		
		
		System.out.println("\nLivros em ordem crescente:");
        for (int ano = menor; ano <= maior; ano++) {
            for (Livro livro : lv) {
                if (livro.getAno() == ano) {
                    System.out.println(livro);
                }
            }
        }
        
        System.out.println ("Livros em ordem decrescente: ");
        for (int ano = maior; ano >= menor; ano--) {
        	for (Livro livro : lv) {
        		if (livro.getAno() == ano) {
        			System.out.println (livro);
        		}
        	}
        }
	}
}
