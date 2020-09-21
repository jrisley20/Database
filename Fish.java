import java.util.ArrayList;


public class Fish extends abstractAnimal{
	private ArrayList<Animal> fish;
	private int fishInArray;
	
	public Fish()
	{
		fish = new ArrayList();
	}
	
	public void addFish(String name, String origin, int weight, String color)
	{
		
		fish.add(new Animal(name, origin, weight, color, Animal.Type.FISH));
		
		fishInArray++;
	}
//	
	public int getFishInArray()
	{
		
		return fishInArray;
	}
//	
//	public Animal getFish(int i)
//	{
//		return fish.get(i);
//	}
//	
//	public ArrayList<Animal> getFishArray()
//	{
//		return fish;
//	}
	
	
}
