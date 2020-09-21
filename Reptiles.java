import java.util.ArrayList;



public class Reptiles extends abstractAnimal {

	private ArrayList<Animal> reptiles;
	private int reptsInArray;
	
	public Reptiles()
	{
		reptiles = new ArrayList();
	}
	
	public void addRept(String name, String origin, int weight, String color)
	{
		
		reptiles.add(new Animal(name, origin, weight, color, Animal.Type.REPTILE));
		
		reptsInArray++;
	}
//	
	public int getReptsInArray()
	{
		
		return reptsInArray;
	}
//	
//	public Animal getReptiles(int i)
//	{
//		return reptiles.get(i);
//	}
//	
//	public ArrayList<Animal> getReptileArray()
//	{
//		return reptiles;
//	}
	
	
}