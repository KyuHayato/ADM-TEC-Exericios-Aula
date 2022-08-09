
public class ControleRemoto implements Controlador {
	private int volume;
	private boolean ligado;
	private boolean tocando;

	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getVolume() {
		return this.volume;
	}

	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean getTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public String toString() {
		return "ControleRemoto [volume=" + volume + ", ligado=" + ligado + ", tocando=" + tocando + "]";
	}

	@Override
	public void ligar() {
		if (!getLigado()) {
			setLigado(true);
		}

	}

	@Override
	public void desligar() {
		if(getLigado()) {
			setLigado(false);
		}

	}

	@Override
	public void abrirMenu() {
		if(getLigado()) {
			System.out.println(toString());
		}

	}

	@Override
	public void fecharMenu() {
		System.out.println("fechando menu");

	}

	@Override
	public void aumentarVolume() {
		if(getLigado() && getVolume() < 100) {
			setVolume(getVolume()+1);
		}

	}

	@Override
	public void diminuirVolume() {
		if(getLigado() && getVolume() > 0) {
			setVolume(getVolume()-1);
		}
	}

	@Override
	public void ligarMudo() {
		if(getLigado() && getVolume() > 0) {
			setVolume(0);
			setTocando(false);
		}

	}

	@Override
	public void desligarMudo() {
		if(getLigado() && getVolume() == 0) {
			setVolume(50);
			setTocando(true);
		}

	}

	@Override
	public void play() {
		if(getLigado() && !getTocando()) {
			setTocando(true);
		}

	}

	@Override
	public void pause() {
		if(getLigado() && getTocando()) {
			setTocando(false);
		}

	}

}
