package Exemplo4;

public class Smartphone implements Celular, PC{
	String tell;
	String email;
	
	public Smartphone (String tell, String email) {
		
		this.tell = tell;
		this.email = email;
	}
	@Override
	public void verificaEmail() {
		System.out.println ("Verificando E-Mails: "+email);
	}

	@Override
	public void realizarChamada() {
		System.out.println ("Realizando Chamada "+tell);

	}
	
}
