import java.util.*;
//hola
public class Main{
    public static void main(String[] args) {
        //declaracion variables
        ArrayList <Pedido> pedidos = new ArrayList<>(); 
        //inicio main
        System.out.println("---Datos del pedido---");
        cargarPedido(pedidos);
        imprimirPedidos(pedidos);
    }
//funciones
public static void cargarPedido (ArrayList<Pedido> pedidos){
   //declaracion variables
    var consola = new Scanner(System.in);
    String nombre="";
    float precio=0;
    float tiempo=0;
    //inicio
    //obtenemos datos
    System.out.println("Ingresar nombre del cliente:");
    nombre=consola.nextLine();
    System.out.println("Ingrese el tiempo de espera:");
    tiempo=consola.nextFloat();
    System.out.println("Ingrese el precio total:");
    precio=consola.nextFloat();
    //registramos al cliente y lo agregamos a la lista
    Pedido nuevoPedido = new Pedido(nombre, precio, tiempo);
    pedidos.add(nuevoPedido);
}

public static void imprimirPedidos(ArrayList <Pedido> lista){
    System.out.println("\nSe presenta a continuación la lista de pedidos");
        for (Pedido pedido : lista) {
        System.out.println(pedido);
         }
        System.out.println("\n");
        }
}