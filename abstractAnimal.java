import java.util.ArrayList;



public class abstractAnimal{
	
	private final ArrayList<Animal> animalList;

	public abstractAnimal() {
		animalList = new ArrayList<>();
	}

	public abstractAnimal(final ArrayList<Animal> a) {
		animalList = a;
	}




	public int arraySize() {
		return animalList.size();
	}

	public void addAnimals(Animal a)
	{
		animalList.add(a);
	}
	
	
	public ArrayList<Animal> getArray()
	{
		return animalList;
	}

	


	public void removeAnimal(String name, String type, ArrayList<Animal> anml){
	 	name = name.toLowerCase();
	 	type = type.toLowerCase();
	 	Animal.Type a;
		
	 	switch (type){
	 		case "cat":
	 			a = Animal.Type.CAT;
	 			break;

	 		case "bird":
	 			a = Animal.Type.BIRD;
	 			break;

	 		case "reptile":
	 			a = Animal.Type.REPTILE;
	 			break;
			
	 		case "fish":
	 			a = Animal.Type.FISH;
				break;

	 		default:
	 			a = Animal.Type.CAT;
	 	}

	 	for (int i = 0; i < anml.size(); i++){
	 		if (anml.get(i).getName().equals(name) && anml.get(i).getType() == a){
	 			anml.remove(i);
	 			break;
	 		}
	 	}

	 }
	
}
