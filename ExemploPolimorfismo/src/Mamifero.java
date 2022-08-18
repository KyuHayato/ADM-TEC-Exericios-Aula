
public class Mamifero extends Animal {
	private String corPelo;

	public Mamifero(double peso, int idade, int membros, String corPelo) {
		super(peso, idade, membros);
		this.corPelo = corPelo;
		
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	@Override
	public void locomover() {
		// TODO Auto-generated method stub

	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub

	}

}
