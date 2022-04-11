
public class Libro implements Comparable<Libro>{
	private String nombredellibro;
	private String nombredelAutor;
	private int codigo;
	private float precio;
	
	public Libro (String nombredellibro , String nombredelAutor, int codigo, float precio) {
		this.nombredellibro=nombredellibro;
		this.nombredelAutor=nombredelAutor;
		this.codigo=codigo;
		this.setPrecio(precio);
	}
	public String getNombredellibro() {
		return nombredellibro;
	}
	public void setNombredellibro(String nombredellibro) {
		this.nombredellibro = nombredellibro;
	}
	public String getNombredelAutor() {
		return nombredelAutor;
	}
	public void setNombredelAutor(String nombredelAutor) {
		this.nombredelAutor = nombredelAutor;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = 0;
		if (precio>0)
			this.precio = precio;
	}
	public int compareTo(Libro e) 
	{
		int estado=-1;
		if(this.codigo== e.getCodigo()) 
		{
			estado=0;
		}else if(this.codigo > e.getCodigo()) 
		{
			estado=1;
		}
		return estado;
	}
	@Override
	public String toString() {
		return "\n"+"Libro: " + nombredellibro + "\n"+"Nombre del Autor :" + nombredelAutor +"\n"+ "Codigo :" + codigo
				+ "\n" +"Precio :" + precio +"\n";
	}
	
	
}
