public class Medico implements Comparable<Medico>{
    private String Nombre;
    private String Apellido;
    private String Especialidad;
    private int Codigo;

    public Medico(String Nombre, String Apellido, String Especialidad, int Codigo)
    {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Especialidad = Especialidad;
        this.Codigo = Codigo;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        this.Codigo = codigo;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
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
        return "Doctor: " + this.Nombre + " " + this.Apellido + "\n" + "Especialidad: " + this.Especialidad + "\n" + "Codigo: " + this.Codigo;
    }

    public boolean equals(Medico e)  // el equals es para saber si una cadena es igual que la otra
	{
		if (e.getNombre().equals(Nombre) && e.getApellido().equals(Apellido))
			return true;
		else {
			return false;
		}
	
	}

    public int compareTo(Medico e) 
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

