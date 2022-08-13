
public class Professor extends Pessoa {

	private String formacao;
	private String areaInteresse;

	public Professor(String nome, int idade) {
		super(nome, idade);
		this.formacao = "";
		this.areaInteresse = "";
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public String getAreaInteresse() {
		return areaInteresse;
	}

	public void setAreaInteresse(String areaInteresse) {
		this.areaInteresse = areaInteresse;
	}
	
}
