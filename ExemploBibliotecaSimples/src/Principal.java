
public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Mihay");
		Livro livro1 = new Livro("As cronicas de narnia","CS Lewis",523,pessoa1);
		livro1.detalhes();
		livro1.abrir();
		livro1.folhear(1);
		livro1.folhear(1);
		livro1.folhear(1);
		livro1.detalhes();
		livro1.folhear(2);
		livro1.detalhes();
		livro1.avancarPagina();
		livro1.avancarPagina();
		livro1.detalhes();
	}

}
