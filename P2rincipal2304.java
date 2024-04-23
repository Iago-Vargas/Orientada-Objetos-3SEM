package ExAula;

public class P2rincipal2304 {
	public static void main (String [] args) {
		Aluno2304 aluno = new Aluno2304 ("Iago Vargas", 10);
		System.out.println (aluno.getNome());
		System.out.println (aluno.getNota());
		
		aluno.setNome("Iago Vargas");
		aluno.setNota(10);
		
		System.out.println (aluno.getNome());
		System.out.println (aluno.getNota());
		
		System.out.println (aluno.media());
	}
}
