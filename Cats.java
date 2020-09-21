import java.util.ArrayList;



public class Cats extends abstractAnimal
{
	
	private ArrayList<Animal> cats;
	private int catsInArray;
	
	public Cats()
	{
		cats = new ArrayList();
	}
	
	public void addCats(String name, String origin, int weight, String color)
	{		
		cats.add(new Animal(name, origin, weight, color, Animal.Type.CAT));		
		catsInArray++;
	}
//	
	public int getCatsInArray()
	{		
		return catsInArray;
	}
	
	public ArrayList<Animal> getCatArray()
	{
		return cats;
	}
	
	
	public Animal getCat(int i)
	{
		return cats.get(i);
	}
	

}
