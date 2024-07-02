package Ex9;

public interface AcessoDados {
	void conectar();
	void desconectar();
	void inserir(String dados);
	void atualizar(String dados);
	void excluir(String dados);
	
}
