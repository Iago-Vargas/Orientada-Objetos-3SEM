package ExAula;

class Carro {
  public String marca;
  public String tipo;

  public Carro(String marca) {
    this.marca = marca;
  }

  public Carro(String marca, String tipo) {
    this.marca = marca;
    this.tipo = tipo;
  }

  public void mostrarDetalhes() {
    System.out.println("Marca: " + marca);
    if (tipo != null) {
      System.out.println("Tipo: " + tipo);
    }
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getTipo() {
    return tipo;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getMarca() {
    return marca;
  }
}
