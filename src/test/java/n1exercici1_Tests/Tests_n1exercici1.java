package n1exercici1_Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import n1exercici1.Months;

public class Tests_n1exercici1 {

	private Months months = new Months();
	
	@Test
	public void tamanioLista() {
		
		int esperado = 11;
		int resultado = months.LlenarArray().size();
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void controlarArrayNotNull() {
		
		assertNotNull(months);
	}
	
	@Test
	public void controlarDatoEnPosicion() {
	String esperado = "agosto";
	String resultado = months.LlenarArray().get(7);
	assertEquals(esperado, resultado);
	}
	
}
