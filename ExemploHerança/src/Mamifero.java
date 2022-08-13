
public class Mamifero {
	private double tamPelo;
	private char sexo;
	private boolean racional;
	private int numPatas;

	public Mamifero(char sexo, boolean racional, int numPatas) {
		this.sexo = sexo;
		this.racional = racional;
		this.numPatas = numPatas;
	}

	public Mamifero() {

	}

	public double getTamPelo() {
		return tamPelo;
	}

	public void setTamPelo(double tamPelo) {
		this.tamPelo = tamPelo;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public boolean getRacional() {
		return racional;
	}

	public void setRacional(boolean racional) {
		this.racional = racional;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

}
