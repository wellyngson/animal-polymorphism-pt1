package main;
import mammal.Mammal;
import mammal.Dog;
import reptile.Reptile;
import reptile.Snake;
import fish.Fish;
import fish.Shark;
import bird.Bird;
import bird.Macaw;

public class Main {

	public static void main(String[] args) {

		// CRIANDO OBJETOS
		Mammal mammal = new Mammal();
		Reptile reptile = new Reptile();
		Fish fish = new Fish();
		Bird bird = new Bird();
		
		Dog dog = new Dog();
		Snake snake = new Snake();
		Shark shark = new Shark();
		Macaw macaw = new Macaw();
		
		dog.move();
		dog.toFeed();
		dog.makeSound();
		
		System.out.println("-------------------------");
		
		snake.move();
		snake.toFeed();
		snake.makeSound();

		System.out.println("-------------------------");
		
		shark.move();
		shark.toFeed();
		shark.makeSound();
		
		System.out.println("-------------------------");
		
		macaw.move();
		macaw.toFeed();
		macaw.makeSound();
		
		// UTILIZANDO OS MÉTODOS DA CLASSE MAMMAL
		System.out.println( "-------------------------" + "\n" +
							"MÉTODOS DOS MAMÍFEROS EM GERAL");
		mammal.move();
		mammal.toFeed();
		mammal.makeSound();
	
		// UTILIZANDO OS MÉTODOS DA CLASSE REPTILE
		System.out.println( "-------------------------" + "\n" +
							"MÉTODOS DOS RÉPTEIS EM GERAL");
		
		reptile.move();
		reptile.toFeed();
		reptile.makeSound();
		
		// UTILIZANDO OS MÉTODOS DA CLASSE FISH
		System.out.println( "-------------------------" + "\n" +
							"MÉTODOS DOS PEIXES EM GERAL");
		
		fish.move();
		fish.toFeed();
		fish.makeSound();
		
		// UTILIZANDO OS MÉTODOS DA CLASSE BIRD
		System.out.println( "-------------------------" + "\n" +
							"MÉTODOS DOS PASSÁROS");
		
		bird.move();
		bird.toFeed();
		bird.makeSound();
		
		// 
	
	}

}
