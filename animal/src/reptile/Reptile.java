package reptile;
import animal.Animal;

public class Reptile extends Animal {

	
	// MÉTODOS SOBREPOSTO DA CLASSE ANIMAL
	@Override
	public void move() {
		System.out.println("Rastejando");	
	}

	@Override
	public void toFeed() {
		System.out.println("Comendo vegetais");
	}

	@Override
	public void makeSound() {
		System.out.println("Som de réptil");
	}

}
