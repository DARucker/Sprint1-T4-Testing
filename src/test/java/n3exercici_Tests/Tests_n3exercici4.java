package n3exercici_Tests;

import static org.assertj.core.api.Assertions.atIndex;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import n3exercici4.Cat;
import n3exercici4.Dog;
import n3exercici4.ObjectsList;
import n3exercici4.Restaurant;

public class Tests_n3exercici4 {
			
	ObjectsList objectList = new ObjectsList();
	List<Object> objetos = objectList.fillArray();
	Object lolo = objetos.get(0);
	Object oli = objetos.get(1);
	Object michi = objetos.get(2);
	Object chuleton = objetos.get(3);
	Object resto = objetos.get(4);
	Object kitty = objectList.createOjbect();
	
	@Test
	public void is_Empty() {
		Assertions.assertThat(objetos).isEmpty();
	}
	
	@Test 
	public void contains_In_Same_Orden() {
		Assertions.assertThat(objetos).containsExactly(oli,lolo, michi, chuleton, resto);	
	}

	@Test 
	public void contains_in_Any_Order() {
		Assertions.assertThat(objetos).contains(oli,lolo, michi, chuleton, resto);
	}
	
	@Test 
	public void contains_Object_Not_Included_In_The_ArrayList() {
		Assertions.assertThat(objetos).contains(kitty);
	}
}


