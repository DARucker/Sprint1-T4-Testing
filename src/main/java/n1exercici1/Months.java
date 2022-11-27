package n1exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Months {

	private List<String> months = new ArrayList<String>();

	public List<String> LlenarArray() {

		months.addAll(Arrays.asList("enero", "febrero", "marzo", "abril", "mayo", "Junio", "Julio", "agosto",
				"septiembre", "octubre", "noviembre", "diciembre"));
		
		return months;
	}
	
	
}
