package proyecto3.src;
import java.util.*;

public class GestionadorPedidos {

    public static void agregarPedido(Cola pPendientes){ // pedidos pendientes
        Scanner consola = new Scanner(System.in);
        String nombre = "";
        float precio = 0;
        float tiempo = 0;
        // inicio
        // obtenemos datoss
        System.out.println("Ingresar nombre del cliente:");
        nombre = consola.nextLine();
        System.out.println("Ingrese el tiempo de espera:");
        tiempo = consola.nextFloat();
        System.out.println("Ingrese el precio total:");
        precio = consola.nextFloat();
        
        // creamos el pedido y lo asignamos en la cola 
        // el numero de pedido lo asigna el gestionador de colas automaticamente
        pPendientes.enqueue(new NodoPedido(nombre, precio, tiempo));
        System.out.println("se agrego el pedido correctamente");
    }

    public static void prepararPedido(Cola pPendientes, Pila pDespachados /*pedidos despachados */){
        if (pPendientes.isEmpty()) {
            System.out.println("no hay pedidos pendientes para despachar");
        }else{
            pDespachados.push(pPendientes.top());
            pPendientes.dequeue();
            System.out.println("se despacho un pedido");
        }
    }

    public static void deshacerPedido(Cola pPendientes, Pila pDespachados){
        if (pDespachados.isEmpty()) {
            System.out.println("no hay pedidos despachados que deshacer");
        }else{
            pPendientes.enqueue(pDespachados.top());
            pDespachados.pop();
            System.out.println("se deshizo un pedido despachado");
        }
    }

    public static void mostrarPendientes(Cola pPendientes){ 
        pPendientes.imprimirCola();
    }
}
