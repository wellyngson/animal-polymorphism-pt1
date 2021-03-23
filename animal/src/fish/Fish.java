package fish;
import animal.Animal;

public class Fish extends Animal {

	// ATRIBUTOS ESPECÍFICOS DA CLASSE FISH
	private String scaleColor;
	
	// MÉTODOS ESPECÍFICOS DA CLASSE FISH
	public void dropBubble() {
		System.out.println("Soltando bolha");
	}
	
	// MÉTODOS SOBREPOSTO DA CLASSE ANIMAL
	@Override
	public void move() {
		System.out.println("Nadando");
	}

	@Override
	public void toFeed() {
		System.out.println("Comida de peixe");
	}

	@Override
	public void makeSound() {
		System.out.println("Peixe não faz som");
	}

	
	// MÉTODOS ESPECIAIS GETTERS E SETTERS
	public String getScaleColor() {
		return scaleColor;
	}

	public void setScaleColor(String scaleColor) {
		this.scaleColor = scaleColor;
	}
	

}
