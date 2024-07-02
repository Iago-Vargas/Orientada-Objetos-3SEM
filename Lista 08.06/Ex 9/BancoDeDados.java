package Ex9;

public class BancoDeDados implements AcessoDados{
	private boolean conectar;
	
	public void conectar() {
		if (!conectar) {
			conectar = true;
			System.out.println ("Conectado ao Banco!");
		}
		else {
			System.out.println ("Ja esta conectado");
		}
	}

	
	public void desconectar() {
		if (conectar) {
			conectar = false;
			System.out.println ("Desconectado do Banco");
		}
		else {
			System.out.println("Ja esta desconectado");
		}
	}

	
	public void inserir(String dados) {
		if (conectar) {
			System.out.println ("Dados inseridos: "+dados);
		}
		else {
			System.out.println("Nao foi possivel inserir dados");
		}
		
	}

	
	public void atualizar(String dados) {
		if (conectar) {
			System.out.println("Dados atualizados: "+dados);
		}
		else {
			System.out.println("Nao foi possivel atualizar");
		}
	}

	
	public void excluir(String dados) {
		if (conectar) {
			System.out.println("Dados excluidos: "+dados);
		}
		else {
			System.out.println("Não foi possivel excluir dados");
		}
	}
	
}
