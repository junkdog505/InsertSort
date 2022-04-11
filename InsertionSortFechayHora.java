public class InsertionSortFechayHora {
	public static void main(String[]a) {
		Fecha fechas[] = new Fecha[5];
		fechas[0] = new Fecha(6,2,2005);
		fechas[1] = new Fecha(13,12,2010);
		fechas[2] = new Fecha(15,5,2015);
		fechas[3] = new Fecha(8,10,2014);
		fechas[4] = new Fecha(9,5,2002);
		
		System.out.print(Sorted.insertionSort(fechas));	//Order by Years
		
		Sorted.listAll(fechas);
		
		Hora horas[] = new Hora[5];
		horas[0] = new Hora(6,2);
		horas[1] = new Hora(13,12);
		horas[2] = new Hora(15,5);
		horas[3] = new Hora(8,10);
		horas[4] = new Hora(9,5);
		
		System.out.print(Sorted.insertionSort(horas));	//Order by Hours
		
		Sorted.listAll(horas);

	}
}