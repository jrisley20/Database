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

	public void updateFile(String fileIn, ArrayList<Animal> anml) throws IOException {
		try{
			File obj = new File(fileIn);
			writer = new FileWriter(obj, false);
			for (int i = 0; i < anml.size(); i++){
			writer.write(anml.get(i).toString());
			}

		}catch(NullPointerException npe){
			System.out.println("null pointer");
		}
		
		
		
		writer.close();
		
	}


	public void addToFile(ArrayList<Animal> a, String fileIn, Animal.Type type) throws IOException
	{
		
		try {
			file = fileIn;
			writer = new FileWriter(file, false);
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
				dLine.next();
				String type = dLine.next();
				dLine.next();
				dLine.next();
				String origin = dLine.next();
				dLine.next();
				dLine.next();
				String color = dLine.next();
				dLine.next();
				helpFill(name, type, origin, color, anml);

			}
			reader.close();
		}finally {
			
		}
		
		
	}
	
	private void helpFill(String name, String type, String origin, String color, ArrayList<Animal> anml)
	{
		String line = String.format("%s, %s, %s, %s", name, type, origin, color);
		Scanner scan  = new Scanner(line);
		scan.useDelimiter(",");
		name = scan.next();
		type = scan.next();
		origin = scan.next();
		color = scan.next();
		type = type.toUpperCase();
		switch (type) {
			
			case " CAT":
				Animal a = new Animal(name, origin, color, Animal.Type.CAT);
				anml.add(a);
				break;
				
		
		
		}
		
		
	}
	
	
	

}
