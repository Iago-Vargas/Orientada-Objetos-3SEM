package ExAula;
import java.util.Scanner;

public class M3ain2304 {
	public static void main (String [] src) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println ("Digite a marca: ");
		String marca = scanner.nextLine();
		
		System.out.println ("Digite o modelo: ");
		String modelo = scanner.nextLine();
		
		System.out.println ("Ano do carro: ");
		int ano = scanner.nextInt();
		
		Carro car = new Carro (marca, ano, modelo);
		
		car.lista(marca,ano,modelo);
	}
}

================================================Programa 2
package ExAula;

public class Carro {
    private String marca;
    private int ano;
    private String modelo;

    public Carro(String marca, int ano, String modelo) {
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public void lista (String marca, int ano, String modelo) {
    	 this.marca = marca;
         this.ano = ano;
         this.modelo = modelo;
         
         System.out.println (marca);
         System.out.println (ano);
         System.out.println (modelo);

    }
}
