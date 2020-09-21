import java.util.ArrayList;



public class Birds extends abstractAnimal {

	private ArrayList<Animal> birds;
	private int birdsInArray;
	
	public Birds()
	{
		birds = new ArrayList();
	}
	
	public void addBirds(String name, String origin, int weight, String color)
	{
		
		birds.add(new Animal(name, origin, weight, color, Animal.Type.BIRD));
		
		birdsInArray++;
	}
//	
	public int getBirdsInArray()
	{
		
		return birdsInArray;
	}
//	
//	public Animal getBirds(int i)
//	{
//		return birds.get(i);
//	}
//	
//	public ArrayList<Animal> getBirdArray()
//	{
//		return birds;
//	}
	
	
}
