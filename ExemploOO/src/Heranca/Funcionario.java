package Heranca;

public class Funcionario extends Pessoa {
	
	private String setor;
	private boolean trabalhando;
	
	public Funcionario(String nome, int idade, char sexo, String setor,boolean trabalhando) {
		super(nome, idade, sexo);
		this.setor = setor;
		this.trabalhando = trabalhando;
	}

	@Override
	public String toString() {
		return "Funcionario [setor=" + setor + ", trabalhando=" + trabalhando + ", getNome()=" + getNome()
				+ ", getIdade()=" + getIdade() + ", getSexo()=" + getSexo() + "]";
	}

	public void mudarTrabalho() {
		System.out.println("mudei trabalho");
	}
	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean isTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
}
