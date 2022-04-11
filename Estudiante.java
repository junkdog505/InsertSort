public class Estudiante implements Comparable<Estudiante>{
    private String Nombre;
    private String Apellido;
    private String Carrera;
    private int Codigo;

    public Estudiante(String Nombre, String Apellido, String Carrera, int Codigo)
    {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Carrera = Carrera;
        this.Codigo = Codigo;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        this.Codigo = codigo;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        this.Carrera = carrera;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    
    @Override
    public String toString()
    {
        return "Estudiante: " + this.Nombre + " " + this.Apellido + "\n" + "Carrera: " + this.Carrera + "\n" + "Codigo: " + this.Codigo;
    }

    public boolean equals(Estudiante e)  // el equals es para saber si una cadena es igual que la otra
	{
		if (e.getNombre().equals(Nombre) && e.getApellido().equals(Apellido))
			return true;
		else {
			return false;
		}
	
	}

    public int compareTo(Estudiante e) 
	{
		int estado=-1;
		if(this.Codigo== e.getCodigo()) 
		{
			estado=0;
		}else if(this.Codigo > e.getCodigo()) 
		{
			estado=1;
		}
		return estado;
	}
    
}
