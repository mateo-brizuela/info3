import java.lang.annotation.Retention;

public class Pedido {
    //atributos
    private String nombre;
    private float precioTotal;
    private float tiempo;
    //constructor
    public  Pedido(String n, float pt, float t){
        setNombre(n);
        setPrecioTotal(pt);
        setTiempo(t);
    }
    //getters y setters
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
        return("Nombre:"+getNombre()+"\nPrecio:"+getPrecioTotal()+"\nTiempo:"+getTiempo());
    }
}
