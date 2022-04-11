public class Profesor implements Comparable<Profesor>{
	private String nombre;
	private int edad;
	private double estatura;
	private double peso;
	private String Area;
	
	public Profesor(String nombre, int edad, double estatura, double peso,String Area) {
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
		this.peso = peso;
		this.Area = Area;

	}
	public String getArea() {
		return Area;
	}

	public void setArea(String Area) {
		this.Area = Area;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "\n"+"NOMBRE " + nombre +
				   " EDAD " + edad + 
				   " ESTATURA " + estatura +
				   " PESO " + peso + 
				   " Area "+ this.Area+"\n";
	}
	
	public boolean equals(Profesor e)  // el equals es para saber si una cadena es igual que la otra
	{
		if (e.getNombre().equals(nombre))
			return true;
		else {
			return false;
		}
	
	}
	public int compareTo(Profesor e) 
	{
		int estado=-1;
		if(this.edad== e.getEdad()) 
		{
			estado=0;
		}else if(this.edad > e.getEdad()) 
		{
			estado=1;
		}
		return estado;
	}

}
