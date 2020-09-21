import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class AnimalRunner {
	
	
	public static void main(String[] args) throws IOException {
		
		JFrame frame = new JFrame();
//		Cats cats = new Cats();
//		Reptiles rept = new Reptiles();
//		Birds bird = new Birds();
//		Fish fish = new Fish();
		abstractAnimal animal = new abstractAnimal();
		boolean running = true;
		AnimalWriter writer = new AnimalWriter();
		
		Scanner scan = new Scanner(System.in);
		while (running)
		{
			
			System.out.println("Welcome. What do You want to see\n"
					+ "1) CATS\n"
					+ "2) Reptiles\n"
					+ "3) Fish\n"
					+ "4) Birds\n"
					+ "5) add Cats\n"
					+ "6) add Fish\n"
					+ "7) add Birds\n"
					+ "8) add Reptiles\n"
					+ "9) quit");
			int answer = scan.nextInt();
			
			
			switch (answer)
			{
			
				case 1:
//					for (int i = 0; i < cats.getCatsInArray(); i++)
//					{
//						System.out.println(cats.getCat(i).toString());
//						System.out.println("\n");
//					}
//					System.out.println("\n");
					
					writer.readFile("Cats.txt");
					break;
					
				case 2:
//					for (int i = 0; i < rept.getReptsInArray(); i++)
//					{
//						System.out.println(rept.getReptiles(i).toString());
//						System.out.println("\n");
//					}
//					break;
					writer.readFile("Reptiles.txt");
					break;
			
					
				case 3:
//					for (int i = 0; i < fish.getFishInArray(); i++)
//					{
//						System.out.println(fish.getFish(i).toString());
//						System.out.println("\n");
//					}
//					break;
					writer.readFile("Fish.txt");
					break;
					
					
				case 4:
//					for (int i = 0; i < bird.getBirdsInArray(); i++)
//					{
//						System.out.println(bird.getBirds(i).toString());
//						System.out.println("\n");
//					}
//					break;
					
					writer.readFile("Birds.txt");
					break;
				
				case 5:
					System.out.println("Enter the name <space> origin <space> weight <space> color");
					String nameC = scan.next();
					String originC = scan.next();
					int weightC = scan.nextInt();
					String colorC = scan.next();
					
					animal.addAnimals(new Animal(nameC, originC, weightC, colorC, Animal.Type.CAT));
					writer.addToFile(animal.getArray(), "Cats.txt", Animal.Type.CAT);
					break;
					
				case 6:
					System.out.println("Enter the name <space> origin <space> weight <space> color");
					String nameF = scan.next();
					String originF = scan.next();
					int weightF = scan.nextInt();
					String colorF = scan.next();
					animal.addAnimals(new Animal(nameF, originF, weightF, colorF, Animal.Type.FISH));
					writer.addToFile(animal.getArray(), "Fish.txt", Animal.Type.FISH);
					break;
//					
//					
				case 7:
					System.out.println("Enter the name <space> origin <space> weight <space> color");
					String nameB = scan.next();
					String originB = scan.next();
					int weightB = scan.nextInt();
					String colorB = scan.next();
					animal.addAnimals(new Animal(nameB, originB, weightB, colorB, Animal.Type.BIRD));
					writer.addToFile(animal.getArray(), "Birds.txt", Animal.Type.BIRD);
					break;
					
				case 8:
					System.out.println("Enter the name <space> origin <space> weight <space> color");
					String nameR = scan.next();
					String originR = scan.next();
					int weightR = scan.nextInt();
					String colorR = scan.next();
					animal.addAnimals(new Animal(nameR, originR, weightR, colorR, Animal.Type.REPTILE));
					writer.addToFile(animal.getArray(), "Reptiles.txt", Animal.Type.REPTILE);
					break;
					
					
				case 9:
					System.out.println("bye\n");
					
					running = false;
			}
			
		}

	}
	
}
