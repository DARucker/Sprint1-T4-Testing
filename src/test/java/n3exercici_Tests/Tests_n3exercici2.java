package n3exercici_Tests;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import n3exercici1.ObjetosEnteros;

public class Tests_n3exercici2 {

	ObjetosEnteros o1 = new ObjetosEnteros(4);
	ObjetosEnteros o2 = new ObjetosEnteros(4);
	ObjetosEnteros o3 = o1;

	@Test
	public void test_Objetos_Enteros_Iguales() {

		Assertions.assertThat(o1).isSameAs(o3); // No es error porque son iguales
		Assertions.assertThat(o1).as("  *** Los objetos no coinciden ***").isSameAs(o2);

	}

	@Test
	public void test_Objetos_Enteros_No_Son_Iguales() {

		Assertions.assertThat(o1).isNotEqualTo(o2);// No es error porque son distintos
		Assertions.assertThat(o1).as("*** Los objetos son iguales ***").isNotEqualTo(o3);

	}
}