package practico.proyecto2.src;

public class Pedido {
    //atributos
    private int numeroPedido;
    private String nombre;
    private float precioTotal;
    private float tiempo;
    //constructor
    public Pedido(int np, String n, float pt, float t){
        setNumeroPedido(np);
        setNombre(n);
        setPrecioTotal(pt);
        setTiempo(t);
    }
    //getters y setters
    public int getNumeroPedido() {
        return numeroPedido;
    }
    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getPrecioTotal() {
        return precioTotal;
    }
    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }
    public float getTiempo() {
        return tiempo;
    }
    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }
    //toString
    public String toString(){
        return(getNumeroPedido()+"\t"+getNombre()+"\t"+getPrecioTotal()+"\t"+getTiempo());
    }   
}
   
