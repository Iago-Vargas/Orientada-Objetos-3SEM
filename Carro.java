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
