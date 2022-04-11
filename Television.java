public class Television implements Comparable<Television>{
    private String marca, tipoPantalla;
    private double pulgadas, precio;
    public void setMarca(String marca, String tipoPantalla, double pulgadas, double precio){
        this.marca = marca;
        this.tipoPantalla = tipoPantalla;
        this.pulgadas = pulgadas;
        this.precio = precio;
    }
    public String getMarca() {return this.marca;}
    public void setMarca(String marca) {this.marca = marca;}

    public String getTipoPantalla() {return this.tipoPantalla;}
    public void setTipoPantalla(String tipoPantalla) {this.tipoPantalla = tipoPantalla;}

    public double getPulgadas(){return this.pulgadas;}
    public void setPulgadas(double pulgadas) {this.pulgadas = pulgadas;}

    public double getPrecio() {return this.precio;}
    public void setPrecio(double precio) {this.precio = precio;}

    public int compareTo(Television a){
        if(this.pulgadas > a.pulgadas){return 1;}
        if(this.precio > a.precio){return -1;}
    return 0;
    }
}
