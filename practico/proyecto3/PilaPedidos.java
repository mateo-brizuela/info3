package practico.proyecto3;
import java.security.PrivateKey;
import java.util.ArrayList;
import practico.proyecto2.src.Pedido;

public class PilaPedidos{
    //atributos, va a estar formada por pedidos
    private ArrayList <Pedido> pila;
    //constructor

    public PilaPedidos(ArrayList<Pedido> pila) {
        pila = new ArrayList<>();
    }
    //getters y setters
    public ArrayList<Pedido> getPila() {
        return pila;
    }

    public void setPila(ArrayList<Pedido> pila) {
        this.pila = pila;
    }
    //metodos
    public void push(Pedido pedido){//Inserta un pedido a la pila
        pila.add(pedido);
    }
    public void pop(){

    }
}
