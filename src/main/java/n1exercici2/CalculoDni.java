package n1exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculoDni {

	public String calcularLetra(int dni) {
		
		List<String> letras = new ArrayList<String>();
		letras.addAll(Arrays.asList("T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"));
		int resto = dni % 23;
		String resultado = letras.get(resto);
		return resultado;
		
	}

}
