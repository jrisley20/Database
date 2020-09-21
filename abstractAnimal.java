import java.util.ArrayList;

public class abstractAnimal{
	
	private ArrayList<Animal> animalList;
		
	
	public abstractAnimal()
	{
		animalList = new ArrayList<>();
	}
	
	public void addAnimals(Animal a)
	{
		animalList.add(a);
	}
	
	
	public ArrayList<Animal> getArray()
	{
		return animalList;
	}
	
}
