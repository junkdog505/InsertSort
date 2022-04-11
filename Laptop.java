//public class Laptop implements Comparable<Laptop> {
public class Laptop{
    private String marca, modelo;
    private double precio;
    private int garantia;

    public Laptop(String marca, String modelo, double precio, int garantia) {
            this.marca = marca;
            this.modelo = modelo;
            this.precio = precio;
            this.garantia = garantia;
    }
    public Laptop() {}
    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca;}
    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}
    public double getPrecio() {return precio;}
    public void setPrecio(double precio) {this.precio = precio;}
    public int getGarantia() {return garantia;}
    public void setGarantia(int garantia) {this.garantia = garantia;}
    @Override
    public String toString() {
        return this.marca + " " + this.modelo + "\n" + "precio =" + this.precio + "garantia =" + this.garantia;
    }
}
