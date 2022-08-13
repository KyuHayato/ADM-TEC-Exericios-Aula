
public class Principal {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("João", 30, "medicina");
		Professor professor = new Professor("Paulo",70);
		professor.setFormacao("Medicina");
		aluno.mostrarCartilha();
		aluno.calcularCoeficiente(7, 5, 9, 0);
		aluno.mostrarCartilha();
		aluno.situacaoAluno();
		
	}

}
