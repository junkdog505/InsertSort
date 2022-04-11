
public class Animal implements Comparable<Animal>{
	private String nombre;
	private int edad;
	private double estatura;
	private double peso;
	private String raza;
	
	public Animal(String nombre, int edad, double estatura, double peso, String raza) {
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
		this.peso = peso;
		this.raza = raza;

	}
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
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
		return "NOMBRE " + nombre +
			   " EDAD " + edad + 
			   " ESTATURA " + estatura +
			   " PESO " + peso + " RAZA "+ this.raza;
	}
	public boolean equals(Animal e)  
	{
		if (e.getNombre().equals(nombre) && e.getRaza().equals(raza)  )
			return true;
		else {
			return false;
		}
	
	}
	public int compareTo(Animal e) 
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
