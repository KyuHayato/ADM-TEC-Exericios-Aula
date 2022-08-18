
public class Ave extends Animal{
	private String corPena;
	public Ave(double peso, int idade, int membros, String corPena) {
		super(peso, idade, membros);
		this.corPena = corPena;
	}
	public void fazerNinho() {
		System.out.println("voa voa voa, pega palha");
	}
	
	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
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
