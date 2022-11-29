package n3exercici_Tests;

import static org.assertj.core.api.Assertions.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import n3exercici1.Dog;

public class Tests_n3_Practicas {

	Dog Lolo;
	Dog Oli;
	Dog Oli2;

	@Test
	public void testMethod_Objects() {
		Lolo = new Dog("lolo", 5.2);
		Oli = new Dog("Oli", 7.5);
		Oli2 = new Dog("Oli", 7.5);

		Assertions.assertThat(Oli2).isEqualToComparingFieldByField(Lolo);
		// Assertions.assertThat(Oli2).isEqualToComparingOnlyGivenFields(Oli);
	}

	@Test
	public void TestMethod_Arrays_and_Lists() {
		String[] countries = new String[] { "Argentina", "Uruguay", "Brasil" };
		Assertions.assertThat(countries).hasSize(3).contains("Alemania");
		Assertions.assertThat(countries).contains("España");
	}

	@Test
	public void TestMethod_Strings() {
		String hello = "Hello world";
		// Assertions.assertThat(hello).startsWith("He");
		Assertions.assertThat(hello).doesNotContain("pe");
	}

	@Test
	public void TestMethod_Numbers() {
		Double value = 12.0;
		Assertions.assertThat(value).isLessThan(3.0);
	}
	
	@Test
	public void TestMethod_Maps() {
	
		Map<String, String> countryCityMap = new HashMap<>();
		countryCityMap.put("Argintina", "BA");
		countryCityMap.put("Uruguay", "Montevideo");
		countryCityMap.put("Brasil", "Brasilia");
		countryCityMap.put("Chile", "Santiago");
		
		Assertions.assertThat(countryCityMap).as("******* Lima, Peru debe estar incluido").containsEntry("Peru", "Lima");
	}
	@Test
	public void TestMethod_Throwable() {
	
		IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Este es un mensaje de error");
		IllegalArgumentException illegalArgumentExceptionWithCause = new IllegalArgumentException("Este es un mensaje de error", new IOException());;
		
		//Assertions.assertThat(illegalArgumentException).hasMessage("***Holis");
		Assertions.assertThat(illegalArgumentExceptionWithCause).hasCauseExactlyInstanceOf(ArithmeticException.class);
	
	}
}
