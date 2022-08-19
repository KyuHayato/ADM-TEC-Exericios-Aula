
public class Reptil extends Animal {
	
	private String corEscama;
	
	public Reptil(double peso, int idade, int membros, String corEscama) {
		super(peso, idade, membros);
		this.corEscama = corEscama;
	}
	
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("rastejando");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("inseto");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("qui qui");
	}
}
