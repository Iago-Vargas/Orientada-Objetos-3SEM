package Ex9;

public class Main {

	public static void main(String[] args) {
		BancoDeDados bd = new BancoDeDados ();
		
		bd.conectar();
		bd.inserir("Romeo");
		bd.atualizar("Iago");
		bd.excluir ("Viti");
		bd.desconectar();
	}

}
