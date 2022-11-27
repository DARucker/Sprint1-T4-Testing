package n1exercici1_Tests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import n1exercici3.MonthsException;

public class Tests_n1exercici3 {

	private MonthsException monthsException = new MonthsException();
	
	@Test
	public void probarExcepciones() {

		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {monthsException.retornaMes(11);}, "** El valor elegido está dentro del array. No se producirá la excepción **");		
		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {monthsException.retornaMes(15);}, "** El valor elegido está dentro del array. No se producirá la excepción **");
	}
	
	@Test
	public void probarExcepcionesControl() {

		Assertions.assertThrows(ArithmeticException.class, () -> {monthsException.retornaMes(14);
		});
	}
	
	
}
