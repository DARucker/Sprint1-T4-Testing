package n3exercici_Tests;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import n3exercici7.EmptyOptional;

public class Tests_n3exercici7 {

	EmptyOptional emptyOptional = new EmptyOptional();
	
	@Test
	public void Method_Test_Optional(){
		
		Optional<String> optional = emptyOptional.returnOptional();
		
		Assertions.assertThat(optional).isEmpty();
		
		
	}
	
}
