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
		
		
		abstractAnimal animal = new abstractAnimal();
		boolean running = true;
		AnimalWriter writer = new AnimalWriter();
		Scanner scan = new Scanner(System.in);
		writer.fillArray("Cats.txt", animal.getArray());
		System.out.println(animal.arraySize());
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
					+ "9) remove animal\n"
					+ "10) quit");
			int answer = scan.nextInt();
			
			
			switch (answer)
			{
			
				case 1:

					
					writer.readFile("Cats.txt");
					break;
					
				case 2:

					writer.readFile("Reptiles.txt");
					break;
			
					
				case 3:

					writer.readFile("Fish.txt");
					break;
					
					
				case 4:

					
					writer.readFile("Birds.txt");
					break;
				
				case 5:
					System.out.println("Enter the name <space> origin <space> color");
					String nameC = scan.next();
					nameC = nameC.toLowerCase();
					String originC = scan.next();
					originC = originC.toLowerCase();
					String colorC = scan.next();
					colorC = colorC.toLowerCase();
					animal.addAnimals(new Animal(nameC, originC, colorC, Animal.Type.CAT));
					writer.addToFile(animal.getArray(), "Cats.txt", Animal.Type.CAT);
					break;
					
				case 6:
					System.out.println("Enter the name <space> origin <space> color");
					String nameF = scan.next();
					nameF = nameF.toLowerCase();
					String originF = scan.next();
					originF = originF.toLowerCase();
					int weightF = scan.nextInt();
					String colorF = scan.next();
					colorF = colorF.toLowerCase();
					animal.addAnimals(new Animal(nameF, originF, colorF, Animal.Type.FISH));
					writer.addToFile(animal.getArray(), "Fish.txt", Animal.Type.FISH);
					break;
										
				case 7:
					System.out.println("Enter the name <space> origin <space> color");	
					String nameB = scan.next();
					nameB = nameB.toLowerCase();
					String originB = scan.next();
					originB = originB.toLowerCase();
					int weightB = scan.nextInt();
					String colorB = scan.next();
					colorB = colorB.toLowerCase();
					animal.addAnimals(new Animal(nameB, originB, colorB, Animal.Type.BIRD));
					writer.addToFile(animal.getArray(), "Birds.txt", Animal.Type.BIRD);
					break;
					
				case 8:
					System.out.println("Enter the name <space> origin <space> color");
					String nameR = scan.next();
					nameR = nameR.toLowerCase();
					String originR = scan.next();
					originR = originR.toLowerCase();
					int weightR = scan.nextInt();
					String colorR = scan.next();
					colorR = colorR.toLowerCase();
					animal.addAnimals(new Animal(nameR, originR, colorR, Animal.Type.REPTILE));
					writer.addToFile(animal.getArray(), "Reptiles.txt", Animal.Type.REPTILE);
					break;
				
					


				case 9:
					
					System.out.println("Enter the name: ");
					String name = scan.next();
					name = name.toLowerCase();
					System.out.println("Enter type(CAT,FISH,REPTILE,BIRD): ");
					String type = scan.next();
					type = type.toUpperCase();
					switch (type){
						case "CAT":
							animal.removeAnimal(name, type, animal.getArray());
							writer.updateFile("Cats.txt", animal.getArray());
							break;
							
					}
					break;
					
				case 10:
					System.out.println("bye\n");
					
					running = false;
			}
			
		}

	}
	
}
