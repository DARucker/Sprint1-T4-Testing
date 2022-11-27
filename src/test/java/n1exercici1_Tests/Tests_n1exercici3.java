package n1exercici1_Tests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import n1exercici3.MonthsException;

public class Tests_n1exercici3 {

	private MonthsException monthsException = new MonthsException();
	
	@Test
	public void probarExcepciones() {

		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {monthsException.retornaMes(11);}, "** El valor elegido est� dentro del array. No se producir� la excepci�n **");		
		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {monthsException.retornaMes(15);}, "** El valor elegido est� dentro del array. No se producir� la excepci�n **");
	}
	
	@Test
	public void probarExcepcionesControl() {

		Assertions.assertThrows(ArithmeticException.class, () -> {monthsException.retornaMes(14);
		});
	}
	
	
}
