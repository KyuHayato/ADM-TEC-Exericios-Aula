
public class Livro implements Publicacao {
	private String titulo;
	private String autor;
	private int totalPagina;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;

	public Livro(String titulo, String autor, int totalPagina, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totalPagina = totalPagina;
		this.leitor = leitor;
		this.aberto = false;
		this.pagAtual = 0;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", totalPagina=" + totalPagina + ", pagAtual="
				+ pagAtual + ", aberto=" + aberto + ", leitor=" + leitor.getNome() + "]";
	}

	public void detalhes() {
		System.out.println(toString());
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotalPagina() {
		return totalPagina;
	}

	public void setTotalPagina(int totalPagina) {
		this.totalPagina = totalPagina;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean getAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		if (!getAberto()) {
			setAberto(true);
		}

	}

	@Override
	public void fechar() {
		if (getAberto()) {
			setAberto(false);
		}

	}

	@Override
	public void folhear(int opcao) {
		if (getAberto()) {
			if (opcao == 1) {
				avancarPagina();
			} else if (opcao == 2) {
				voltarPagina();
			} else {
				System.out.println("opção invalida");
			}
		}
	}

	@Override
	public void avancarPagina() {
		if (getAberto() && getPagAtual() <= getTotalPagina()) {
			setPagAtual(getPagAtual() + 1);
		}

	}

	@Override
	public void voltarPagina() {
		if (getAberto() && getPagAtual() > 0) {
			setPagAtual(getPagAtual() - 1);
		}

	}

}
