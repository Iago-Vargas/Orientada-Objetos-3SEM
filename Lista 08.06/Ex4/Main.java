package Ex4;

public class Main {

	public static void main(String[] args) {
		Pessoa pf = new PessoaFisica ("Santiago", "Maria Clara", "037.726.410-59");
		pf.efetuarCompra();
		
		Pessoa pj  = new PessoaJuridica ("Sao Joao", "Santa Maria", "88.212.113-0034-60");
		pj.efetuarCompra();
	}

}
