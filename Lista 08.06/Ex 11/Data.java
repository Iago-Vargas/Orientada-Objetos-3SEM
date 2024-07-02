package Ex12;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data (int dia, int mes, int ano) throws IllegalArgumentException{
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
        validarData(dia, mes, ano);
	}
	
	public int getMes() {
		return mes;
	}
	public int getAno() {
		return ano;
	}
	public int getDia() {
		return dia;
	}

	public void setDia (int dia) throws IllegalArgumentException {
		validarData (dia, this.ano, this.mes);
		this.dia = dia;
	}
	public void setMes (int mes) throws IllegalArgumentException {
		validarData (this.dia, this.ano, mes);
		this.mes = mes;
	}
	public void setAno (int ano) throws IllegalArgumentException {
		validarData (this.dia, ano, this.mes);
		this.ano = ano;
	}
	
	private void validarData (int dia, int ano, int mes) throws IllegalArgumentException{
		if (mes < 1 || mes > 12) {
			throw new IllegalArgumentException ("Mes invalido: "+mes);
		}
		if (dia < 1 || dia > 31) {
			throw new IllegalArgumentException ("Dia invalido: "+dia);
		}
		if ((mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia == 31) {
			throw new IllegalArgumentException ("Mes: "+mes+" nao possui "+dia+" dias!");
		}
	}
	public String toString () {
		return "{ Data: "+dia+"/"+mes+"/"+ano+" }";
	}
	
}
