import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalWriter {
	
	
	FileWriter writer;
	String file;
	
	public AnimalWriter()
	{
		
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
	
	
	
	
	

}
