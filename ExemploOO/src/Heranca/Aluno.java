package Heranca;

public class Aluno extends Pessoa {
	private int matricula;
	private String curso;
	
	public Aluno(String nome, int idade, char sexo,int matricula,String curso) {
		super(nome, idade, sexo);
		this.matricula = matricula;
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", curso=" + curso + ", getNome()=" + getNome() + ", getIdade()="
				+ getIdade() + ", getSexo()=" + getSexo() + "]";
	}

	public void cancelarMatricula() {
		System.out.println("cancelar matricula");
	}
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	

}
