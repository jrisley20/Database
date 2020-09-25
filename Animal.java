//import Animal.Type;

public class Animal {
	private String name;
	private String origin;
	private int weight;
	private String color;
	private String speed;
	private Type type;
	
	public Animal(String nameIn, String origin, String colorIn, Type a)
	{
		name = nameIn;
		type = a;
		color = colorIn;
		setSpeed(type);
		setWeight(type);
	}
	
	enum Type
	{
		CAT,
		BIRD,
		REPTILE,
		FISH
	}
	
	public Animal.Type getType()
	{
		return type;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getSpeed()
	{
		return speed;
	}
	
	public int getWeight()
	{
		return weight;
	}


	public void setWeight(Type a)
	{
		type = a;
		if (type == type.CAT)
		{
			weight = 200;
		}
		
		else if (type == type.BIRD)
		{
			weight = 10;
		}
		
		else if (type == type.FISH)
		{
			weight = 8;
		}
		
		else if (type == type.REPTILE)
		{
			weight = 35;
		}
	}

	
	public String getColor()
	{
		return color;
	}
	
	public void setSpeed(Type a)
	{
		type = a;
		if (type == type.CAT)
		{
			speed = "avg: 50 mph";
		}
		
		else if (type == type.BIRD)
		{
			speed = "avg: 20-30 mph";
		}
		
		else if (type == type.FISH)
		{
			speed = "avg: 35 mph";
		}
		
		else if (type == type.REPTILE)
		{
			speed = "avg: 10-15 mph";
		}
		
	}
	
	public String getOrigin()
	{
		return origin;
	}
	
	
	
	@Override
	public String toString()
	{
		return String.format("NAME: %s TYPE: %s ORIGIN: %s COLOR: %s WEIGHT: %dlb SPEED: %s\n", name, type, origin, color, weight, speed);
	}
}
