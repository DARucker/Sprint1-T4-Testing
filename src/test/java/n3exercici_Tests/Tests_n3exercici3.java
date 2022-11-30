package n3exercici_Tests;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests_n3exercici3 {

	int[] array1 = new int[] {1,3,5,7};
	int[] array2 = new int[] {1,3,5,7};
	int[] array3 = new int[] {3,5,7,9};
	
	// Una asserció que indiqui que dos arrays d'enters són idèntics.
	
	@Test
	public void Test_Que_2_Arrays_De_Enteros_Son_Identics() {
		
		Assertions.assertThat(array1).isEqualTo(array2); // No hay error porque son identicos
		Assertions.assertThat(array1).as("  *** Los Arrays no son identicos ***").isEqualTo(array3);
	}
	
}
