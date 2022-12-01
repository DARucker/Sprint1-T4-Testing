package n3exercici4;

import java.util.ArrayList;
import java.util.List;

public class ObjectsList {

	List <Object> objets1 = new ArrayList();

public static void main(String[] args) {
	
	ObjectsList ol = new ObjectsList();
	ol.fillArray();
		
	}
	
	
	public List<Object> fillArray() {
		
		objets1.add(new Dog("Lolo", 4));
		objets1.add(new Dog("Oli", 4));
		objets1.add(new Cat("Michi", 2));
		objets1.add(new Restaurant("Chuleton", "Balmes", 1));
		objets1.add(new Restaurant("Resto", "Diagonal", 2));
		
		for (Object object : objets1) {
			System.out.println(object);
		}
		return objets1;
	}
	
}
