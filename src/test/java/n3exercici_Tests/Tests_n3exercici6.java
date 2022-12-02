package n3exercici_Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import n3exercici6.MonthsException;

public class Tests_n3exercici6 {

	MonthsException monthException = new MonthsException();
	
	@Test
	public void test_Exception() {
		
		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {monthException.retornaMes(8);}, "This month is in the list. No exception will be trhown.");
	}
	
}
