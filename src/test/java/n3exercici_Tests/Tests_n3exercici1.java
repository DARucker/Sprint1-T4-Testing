package n3exercici_Tests;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import n3exercici1.Dog;

public class Tests_n3exercici1 {

	Dog Lolo;
	Dog Oli;
	Dog Oli2;

	
	@Test
	public void testMethod_Objects() {
		Lolo = new Dog("lolo", 5.2);
		Oli = new Dog("Oli", 7.5);
		Oli2 = new Dog("Oli", 7.5);
		
		Assertions.assertThat(Oli2).isEqualToComparingFieldByField(Oli);
		//Assertions.assertThat(Oli2).isEqualToComparingOnlyGivenFields(Oli);

	}
	
	}
	
