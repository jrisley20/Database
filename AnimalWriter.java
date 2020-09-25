import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalWriter{
	
	
	FileWriter writer;
	String file;
	public AnimalWriter()
	{
		
	}

	public void updateFile(File fileIn, ArrayList<Animal> anml) throws IOException {
		try{
			writer = new FileWriter(fileIn, true);
			for (int i = 0; i < anml.size(); i++){
			writer.write(anml.get(i).toString());
			}

		}catch(NullPointerException npe){
			System.out.println("null pointer");
		}
		
		
		
		writer.close();
		
	}

	public void removeFromFile(String fileIn, String nameIn, String typeIn, ArrayList<Animal> anml) throws IOException {
		try {
			abstractAnimal ab = new abstractAnimal(anml);
			file = fileIn;
			File obj = new File(file);
			System.out.println("check");
			Scanner scan = new Scanner(obj);
			while(scan.hasNextLine()){
				String lineString = scan.nextLine();
				Scanner line = new Scanner(lineString);
				//line.next();
				System.out.println(lineString);
				line.useDelimiter(",");
				String anmlName = line.next();
				System.out.println(anmlName);
				String type = line.next();
				System.out.println(type);
				if (anmlName.contains(nameIn) && type.contains(typeIn)){
					lineString = "" + "\b";
					System.out.println("here!!!");
					line.close();
					updateFile(obj, anml);
					break;
				}
				
			}

			scan.close();

		} catch (Exception e) {
			System.out.println( e + "error.");
		}
	}
	
	public void addToFile(ArrayList<Animal> a, String fileIn, Animal.Type type) throws IOException
	{
		
		try {
			file = fileIn;
			writer = new FileWriter(file, true);
			System.out.println("success");
			
			for (int i = 0; i < a.size(); i++)
			{
				if (type == Animal.Type.CAT)
				{
					writer.write(a.get(i).toString());
				}
				else if (type == Animal.Type.BIRD)
				{
					writer.write(a.get(i).toString());
				}
				else if (type == Animal.Type.FISH)
				{
					writer.write(a.get(i).toString());
				}
				else if (type == Animal.Type.REPTILE)
				{
					writer.write(a.get(i).toString());
				}
				
			}
			writer.close();
			
		}catch(FileNotFoundException fnfe)
		{
			System.out.println("file not found");
		}

	
	}
	
	

	public void readFile(String readFile) throws FileNotFoundException
	{
		
		try {
			File obj = new File(readFile);
			Scanner reader = new Scanner(obj);
			
			while (reader.hasNextLine())
			{
				String data = reader.nextLine();
				System.out.println(data);
			}
			reader.close();
		}finally {
			
		}
		
		
	}


	public void fillArray(String readFile, ArrayList<Animal> anml) throws FileNotFoundException
	{
		
		try {
			File obj = new File(readFile);
			Scanner reader = new Scanner(obj);
			
			while (reader.hasNextLine())
			{
				String data = reader.nextLine();
				Scanner dLine = new Scanner(data);
				dLine.useDelimiter(" ");
				dLine.next();
				String name = dLine.next();
				System.out.println(name);
				dLine.next();
				String type = dLine.next();
				System.out.println(type);
				dLine.next();
				String origin = dLine.next();
				dLine.next();
				String color = dLine.next();
				dLine.next();
				//helpFill(name, type, origin, color);

			}
			reader.close();
		}finally {
			
		}
		
		
	}
	
	
	
	
	

}
