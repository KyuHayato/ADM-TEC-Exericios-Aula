
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Canguru cang = new Canguru(45,2,4,"marrom");
		System.out.println("Idade do nosso cang "+cang.getIdade());
		System.out.println(cang);
		//cang.locomover();
		Peixe peixe = new Peixe(1,1,0,"azul");
		//peixe.alimentar();
		Tartaruga tatt = new Tartaruga(1,1,4,"cinza");
		//tatt.locomover();
		Reptil rept = new Reptil(1,1,4,"verde");
		//rept.locomover();
		//Animal animal = new Animal(12,32,3,"Preto");
	}

}
