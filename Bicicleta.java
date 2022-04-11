//public class Bicicleta implements Comparable<Bicicleta>
public class Bicicleta {
    private String marca, modelo;
    private double precio;
    public Bicicleta(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    public Bicicleta() {}
    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca;}
    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}
    public double getPrecio() {return precio;}
    public void setPrecio(double precio) {this.precio = precio;}
    @Override
    public String toString() {
        return this.marca + " " + this.modelo + "\n" + "precio =" + this.precio;
    }
}
