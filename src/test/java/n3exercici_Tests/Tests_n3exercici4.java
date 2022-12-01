package n3exercici_Tests;

import static org.assertj.core.api.Assertions.atIndex;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import n3exercici4.Dog;
import n3exercici4.ObjectsList;

public class Tests_n3exercici4 {
		
	/*
	 * Crea un arrayList contenidor de diversos tipus d'objectes
	 *  (crea'ls també). 
	 * Escriu una asserció per a verificar l'ordre 
	 * dels objectes en l'ArrayList segons han estat inserits.
	 * 
	 * Ara verifica que la llista anterior conté els objectes en 
	 * qualsevol ordre.
	 * 
	 * Verifica que, en la llista anterior, un dels objectes 
	 * s'ha afegit només una vegada. Deixa un dels elements sense afegir, 
	 * i verifica que la llista no conté aquest últim.
	 */
	
	ObjectsList objectList = new ObjectsList();
	List<Object> objetos = objectList.fillArray();
	Object Lolo = (Dog) objetos.get(1);
	Object dog = new Dog();
	
	@Test
	public void pruebas() {

		Assertions.assertThat(objetos).isEmpty();
	}
	
	@Test public void contains() {
		Assertions.assertThat(objetos).contains(Lolo, 1);
		
	}

}


