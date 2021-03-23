package mammal;

public class Dog extends Mammal {
	
	// MÉTODO PRA COMER SOBREPOSTO
	@Override
	public void toFeed() {
		System.out.println("O chachorro come ração.");
	}
	
	// MÉTODO DE EMITIR SOM SOBREPOSTO
	@Override
	public void makeSound() {
		System.out.println("O cachorro está latindo");
	}
	
}
