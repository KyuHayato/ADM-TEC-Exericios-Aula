
public class Canguru extends Mamifero {

	public Canguru(double peso, int idade, int membros, String corPelo) {
		super(peso, idade, membros, corPelo);
		// TODO Auto-generated constructor stub
	}
	public void usarBolsa() {
		System.out.println("carregar filhote");
	}
	@Override
	public void locomover() {
		System.out.println("saltitando");
	}
	@Override
	public String toString() {
		return "Canguru [Cor de pelo=" + getCorPelo() + ", Peso=" + getPeso() + ", Idade=" + getIdade()
				+ ", Membros=" + getMembros() + "]";
	}
	
}
