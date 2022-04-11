
public class Trabajador {
	private String Nombre;
	 private String Apellido;
	 private String puestoTrabajo;
	 private float Salario;
	 
	 public Trabajador(String Nombre, String Apellido, String puestoTrabajo, float Salario) {
		 this.Nombre=Nombre;
		 this.Apellido=Apellido;
		 this.puestoTrabajo = puestoTrabajo;
		 this.setSalario(Salario);
	 }

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String Apellido) {
		this.Apellido = Apellido;
	}

	public String getPuestoTrabajo() {
		return puestoTrabajo;
	}
	public void setPuestoTrabajo(String puestoTrabajo) {
		this.puestoTrabajo = puestoTrabajo;
	}
	public float getSalario() {
		return Salario;
	}
	public void setSalario(float salario) {
		this.Salario = 0;
		if (Salario>0)
			this.Salario = salario;
	}
	@Override
	public String toString() {
		return "Nombre: "+this.Nombre+"\n"+"Apellido"+this.Apellido + "\n" + "Puesto de trabajo : "+ this.puestoTrabajo + "\n" + "Salario : " + this.Salario;
	}
}
