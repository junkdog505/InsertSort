
public class main {

	public static void main(String[]args) {
	//Persona
	Persona obj[] = new Persona[4];
	obj[0] = new Persona("Sara Lance",30,195,60.71);
	obj[1] = new Persona("Oliver Ramos",24,180,70.60);
	obj[2] = new Persona("Mario Kart",50,200,35.60);
	obj[3] = new Persona("Manuel Salas",97,160,55.30);
	
	System.out.print(Sorted.insertionSort(obj));
	Sorted.listAll(obj);
	//Auto
	Auto obje[] = new Auto[3];
	obje[0] = new Auto("Ford","Mustang Deportivo",100000,15350.53);
	obje[1] = new Auto("Chevrolet","Onix Turbo",58461,1000.02);
	obje[2] = new Auto("Nissan","Sentra",25181.23,20371.12);
	System.out.print(Sorted.insertionSort(obje));
	Sorted.listAll(obje);
	//Clase Animal,Profesor
	Animal obj10[]=new Animal[2];
	Profesor obj1[]=new Profesor[3];
	//Animal
	obj10[0]= new Animal("Hector",15,1.84,78,"Pequines");
	obj10[1]= new Animal("Luis",12,1.83,40,"BLABLA");
	//Profesor
	obj1[0]=new Profesor("Tomas", 30, 1.70, 58, "Matematica");
	obj1[1]=new Profesor("Carlos", 26, 1.79,60, "Ciencia");		
	obj1[2]=new Profesor("David", 21, 1.73, 65, "Comunicacion");
	//Animal
	System.out.println(Sorted.InsertionSort(obj));
	Sorted.listAll(obj);
	//Profesor
	System.out.println(Sorted.InsertionSort(obj1));
	Sorted.listAll(obj1);	
		
	//Clase Fecha y Hora
	Fecha objFecha[]=new Fecha[3];
	Hora objHora[]=new Hora[3];
	//Hora
	objHora[0]=new Hora(10, 3);
	objHora[1]=new Hora(5, 7);
	objHora[2]=new Hora(10, 9);
	System.out.println(Sorted.InsertionSort(objHora));
	Sorted.listAll(objHora);
	//Fecha
	objFecha[0]=new Fecha(3, 16,3000);
	objFecha[1]=new Fecha(10, 6,2000);
	objFecha[2]=new Fecha(9, 7,2020);
	System.out.println(Sorted.InsertionSort(objFecha));
	Sorted.listAll(objFecha);
	//Clase Trabajador y Libros
	Trabajador objTrabajador[]=new Trabajador[3];
	Libros objLibros[]=new Libros[3];
	//Trabajador
	objTrabajador[0]=new Trabajador("Carlos", "Diaz", "Electricista", 2000.50F);
	objTrabajador[1]=new Trabajador("Jorge", "Ata", "Mecanico", 3000.80F);
	objTrabajador[2]=new Trabajador("Nicolle", "Diaz", "Doctor", 2500.90F);
	System.out.println(Sorted.InsertionSort(objTrabajador));
	Sorted.listAll(objTrabajador);
	//Libros
	objLibros[0]=new Libros("La ciudad y los perros", "Mario Vargas Llosa", 1234, 150);
	objLibros[1]=new Libros("La casa verde", "Mario Vargas Llosa", 9812, 200);
	objLibros[2]=new Libros("Los cachorros", "Mario Vargas Llosa", 4513, 300);	
	System.out.println(Sorted.InsertionSort(objLibros));
	Sorted.listAll(objLibros);
		
		
		
		
	Integer arr[]= new Integer[] {3,38,44,15,36,27,2,4,19,50,48};
	System.out.print(Sorted.insertionSort(arr));
	
	Sorted.listAll(arr);
	
	String arreglo[]= new String[] {"Miguel","Saul","Juan"};
	System.out.print(Sorted.insertionSort(arreglo));
	
	Sorted.listAll(arreglo);
	
	String arreglo2[]= new String[] {"23","123","-1"};
	System.out.print(Sorted.insertionSort(arreglo2));
	
	Sorted.listAll(arreglo2);
	
	Sorted.SearchItem(arr, 1);
	Sorted.SearchItem(arreglo, "Miguel");
	}
	

}
