package animal;

public abstract class Animal {

	// ATRIBUTOS
	protected float weight;
	protected int years, member;
	
	// MÉTODOS ABSTRATOS
	public abstract void move(); // Método para andar
	public abstract void toFeed(); // Método para comer
	public abstract void makeSound(); // Método para fazer som
	
	// MÉTODOS ESPECIAIS GETTER E SETTERS
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public int getMember() {
		return member;
	}
	public void setMember(int member) {
		this.member = member;
	}
	
}
