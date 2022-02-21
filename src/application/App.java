package application;

public class App {

	public static void main(String[] args) {
		
		//Fruit[] fruits = Fruit.values();
		//returns a Fruit array of Fruit values
		//lists all the values in the enum
		//Basially, values() is a default enum method
		
		for(Fruit fruit: Fruit.values()) {
			System.out.println(fruit);
		}
		
		System.out.println(Fruit.BANANA.ordinal());
		//.ordinal() shows the position of the value
		//in the array.  Remember that the position
		//of the value can change
		
		Fruit fruit2 = Fruit.valueOf("ORANGE");
		System.out.println(fruit2);
		//This converts the text "ORANGE" to an
		//enum constant
	}
	
}
