package n1exercici3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MonthsException {

	private List<String> months = new ArrayList<>();

	public String retornaMes(int numeroMes) throws ArrayIndexOutOfBoundsException {

		months.addAll(Arrays.asList("enero", "febrero", "marzo", "abril", "mayo", "Junio", "Julio", "agosto",
				"septiembre", "octubre", "noviembre", "diciembre"));

		return months.get(numeroMes);		}

}