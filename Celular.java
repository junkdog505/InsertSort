public class Celular implements Comparable<Celular> {
    private String marca, operadora;
    private double android, precio;
    public Celular(String marca, String operadora, double android, double precio) {
        this.marca = marca;
        this.operadora = operadora;
        this.android = android;
        this.precio = precio;
    }
    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca;}

    public String getOperadora() {return operadora;}
    public void setOperadora(String operadora) {this.operadora = operadora;}

    public double getAndroid() {return android;}
    public void setAndroid(double android) {this.android = android;}

    public double getPrecio() {return precio;}
    public void setPrecio(double precio) {this.precio = precio;}

    public int compareTo(Celular a){
        if(this.android > a.android){return 1;}
        if(this.android < a.android){return -1;}
        return 0;
    }
}
