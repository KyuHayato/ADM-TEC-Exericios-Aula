package Heranca;

public class Escola {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("Alberto",33,'F',1234,"Computa��o");
		//System.out.println(aluno);
		Professor professor = new Professor("Kyu",23,'M',"Programa��o",1500);
		professor.fazerAniversario();
		System.out.println(professor);
		professor.receberAumento();
		System.out.println(professor);
	}

}
