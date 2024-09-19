package proyecto3.src;

public class NodoPedido {
    //atributos
    private int numeroPedido;
    private String nombre;
    private float precioTotal;
    private float tiempo;
    public NodoPedido next;
    //constructor
    public NodoPedido(int numeroPedido, String nombre, float precioTotal, float tiempo){
        this.numeroPedido = numeroPedido;
        this.nombre = nombre;
        this.precioTotal = precioTotal;
        this.tiempo = tiempo;
        next = null;
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
    public NodoPedido getNext(){
        return next;
    }
    public void setNext(NodoPedido next){
        this.next = next;
    }
    //toString
    public String toString(){
        return(getNumeroPedido()+"\t"+getNombre()+"\t"+getPrecioTotal()+"\t"+getTiempo());
    }

}
