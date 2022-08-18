package Heranca;

public class Professor extends Pessoa {
	private String especialidade;
	private double salario;

	public Professor(String nome, int idade, char sexo, String especialidade, double salario) {
		super(nome, idade, sexo);
		this.especialidade = especialidade;
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Professor [especialidade=" + especialidade + ", salario=" + salario + ", getNome()=" + getNome()
				+ ", getIdade()=" + getIdade() + ", getSexo()=" + getSexo() + "]";
	}

	public void receberAumento() {
		setSalario(getSalario()+ 20000);
	}
	
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
