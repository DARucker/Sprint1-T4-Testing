package n3exercici_Tests;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import n3exercici1.ObjetosEnteros;

public class Tests_n3exercici1 {
	
		ObjetosEnteros o1 = new ObjetosEnteros(4);
		ObjetosEnteros o2 = new ObjetosEnteros(4);
		ObjetosEnteros o3 = new ObjetosEnteros(5);
		
		
	
	@Test	
	public void test_Verificar_Si_Coincide_El_Valor_De_Dos_Objetos_Enteros() {
		
		Assertions.assertThat(o1).isEqualToComparingFieldByField(o2); // No es error porque los valores son iguales
		Assertions.assertThat(o1).as("  *** El valor de los objetos no coinciden ***").isEqualToComparingFieldByField(o3);

	}

}
