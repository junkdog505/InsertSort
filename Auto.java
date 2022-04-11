
public class Auto implements Comparable<Auto>{
	private String marca;
	private String modelo;
	private double precio;
	private double kilometraje;
	
	public Auto(String marca,String modelo,double precio,double kilometraje ) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.kilometraje = kilometraje;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}
	
	public int compareTo(Auto a) {
		if(this.kilometraje>a.kilometraje)
			return 1;
		if(this.kilometraje<a.kilometraje)
			return -1;
		return 0;
	}

	
	@Override
	public String toString() {
		return String.format("Marca:%10s \tModelo:%18s \tPrecio: %.2f \tKilometraje: %.2f\n",marca,modelo,precio,kilometraje);
	}
	
	
}










