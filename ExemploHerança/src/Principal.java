
public class Principal {

	public static void main(String[] args) {
		Gato gato = new Gato("Siames",'F',true,4);
		System.out.println(gato.getNumPatas());
		gato.setTamPelo(0.3);
		System.out.println(gato.getTamPelo());
	}

}
