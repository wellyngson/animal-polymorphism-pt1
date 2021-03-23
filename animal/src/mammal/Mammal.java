package mammal;
import animal.Animal;

public class Mammal extends Animal {

	// ATRIBUTOS LOCAIS
	private String hairColor;
	
	
	// CONSTRUTOR
	public Mammal() {
		super();
	}	
	
	
	// CARATETISTICAS DOS ATRIBUTOS
	public void attributesMammal() {
		this.setWeight(35.5f);
		this.setHairColor("Marrom");
		this.setYears(20);
		this.setMember(4);
	}
		
	
	// MÉTODOS SOBREPOSTO DA CLASSE ANIMAL
	@Override
	public void move() {
		System.out.println("Correndo");
	}

	@Override
	public void toFeed() {
		System.out.println("Mamando");
	}

	@Override
	public void makeSound() {
		System.out.println("Som de mamífero");
	}

	// MÉTODOS ESPECIAIS GETTERS E SETTERS
	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	
}
