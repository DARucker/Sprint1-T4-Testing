package n1exercici1_Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;


import n1exercici2.CalculoDni;

	public class Tests_n1exercici2 {

	private CalculoDni calculoDni = new CalculoDni();
	
	@Test
	public void testDnis() {
		String esperado = "L";
		int numero = 55036397;
		String resultado = calculoDni.calcularLetra(numero);
		assertEquals(esperado, resultado);
		
	}
	
	@ParameterizedTest
	@MethodSource("numeroALetra")
	public void listaPruebasDni(int numeroDni, String letra) {	
		assertEquals(letra, calculoDni.calcularLetra(numeroDni));
	}
	
	private static Stream<Arguments> numeroALetra(){
		return Stream.of(
				Arguments.of(55036397, "L"),
				Arguments.of(55036398, "C"),
				Arguments.of(55036399, "K"),
				Arguments.of(55036394, "S"),
				Arguments.of(55036393, "A"),
				Arguments.of(55036392, "J"),
				Arguments.of(55036391, "F"),
				Arguments.of(55036388, "D")
				);
	}
	
	@ParameterizedTest
	@CsvSource({"55036397, L", "55036398, M", "55036394, Z"})
	public void CsvPruebasDni(int numeroDni, String letra) {	
		assertEquals(letra, calculoDni.calcularLetra(numeroDni));
	}
	
	
	
	
}
