package bird;
import animal.Animal;

public class Bird extends Animal {

	// ATRIBUTOS
	private String featherColor;
	
	// MÉTODO ESPECIFICO DA CLASSE BIRD
	public void makeNest() {
		System.out.println("Fazendo ninho");
	}
	
	// MÉTODOS SOBREPOSTO DA CLASSE ANIMAL
	@Override
	public void move() {
		System.out.println("Voando");
	}

	@Override
	public void toFeed() {
		System.out.println("Frutas");
	}

	@Override
	public void makeSound() {
		System.out.println("Som de ave");
	}

	
	// MÉTODOS ESPECIAIS GETTERS E SETTERS
	public String getFeatherColor() {
		return featherColor;
	}

	public void setFeatherColor(String featherColor) {
		this.featherColor = featherColor;
	}
	
}
