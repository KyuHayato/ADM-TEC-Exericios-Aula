
public class Gato extends Mamifero {
	private String raca;
	private String cor;
	private String comportamento;
	private String nome;

	public Gato(String raca, char sexo, boolean racional, int numPatas) {
		super(sexo, racional, numPatas);
		this.raca = raca;
	}

	@Override
	public String toString() {
		return "Gato [raca=" + raca + ", cor=" + cor + ", comportamento=" + comportamento + ", nome=" + nome + "]";
	}

	public void cartaoVacina() {
		System.out.println(toString());
	}

	public void miar() {
		System.out.println("mial");
	}

	public String getRaca() {
		return raca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getComportamento() {
		return comportamento;
	}

	public void setComportamento(String comportamento) {
		this.comportamento = comportamento;
	}

}
