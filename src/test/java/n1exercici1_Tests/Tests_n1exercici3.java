package n1exercici1_Tests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;

import n1exercici3.MonthsException;

public class Tests_n1exercici3 {

	private MonthsException monthsException = new MonthsException();
	
	@Test
	public void probarExcepciones()  {
		
		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {monthsException.retornaMes(15);}, "** El valor elegido esta fuera del array.**");
		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {monthsException.retornaMes(7);}, "ERROR, el valor solicitado esta dentro del array.");
		}
	
	
	// Pruebo el test con una excepcion distinta 
	@Test
	public void probarExcepcionesControl() {

		Assertions.assertThrows(ArithmeticException.class, () -> {monthsException.retornaMes(14);
		});
	}
	
	
}

