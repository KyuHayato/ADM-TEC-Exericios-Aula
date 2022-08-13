
public class Aluno extends Pessoa {
	private String curso;
	private double coeficienteRendimento;

	public Aluno(String nome, int idade, String curso) {
		super(nome, idade);
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", coeficienteRendimento=" + coeficienteRendimento + "nome do aluno="
				+ getNome() + " idade=" + getIdade() + "]";
	}

	public void mostrarCartilha() {
		System.out.println(toString());
	}

	public double calcularCoeficiente(double nota1, double nota2, double nota3, double nota4) {
		this.coeficienteRendimento = (nota1 + nota2 + nota3 + nota4) / 4;
		return coeficienteRendimento;
	}
	public void situacaoAluno() {
		if(getCoeficienteRendimento() >= 7) {
			System.out.println("Aprovado! Ufa");
		} else if(getCoeficienteRendimento()>= 5 && getCoeficienteRendimento() <7) {
			System.out.println("Recuperação! Ainda tem chances");
		}else {
			System.out.println();
		}
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double getCoeficienteRendimento() {
		return coeficienteRendimento;
	}

	public void setCoeficienteRendimento(double coeficienteRendimento) {
		this.coeficienteRendimento = coeficienteRendimento;
	}

}
