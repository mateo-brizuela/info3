package proyecto2.src;
import java.util.*;
import static proyecto2.src.Ordenador.ordenarPorTiempo;
import static proyecto2.src.Ordenador.ordenarPorNombre;
import static proyecto2.src.Ordenador.ordenarPorPrecio;

public class Main {
    public static void main(String[] args) {
        // declaracion variables
        ArrayList<Pedido> pedidos = new ArrayList<>();
        var consola = new Scanner(System.in);
        int menu_op = 0;
        boolean exit = false;

        pedidos.add(new Pedido(1,"g",5,5));
        pedidos.add(new Pedido(2,"c",4,4));
        pedidos.add(new Pedido(3,"b",3,3));
        pedidos.add(new Pedido(4,"f",2,2));
        pedidos.add(new Pedido(5,"d",1,1));
        pedidos.add(new Pedido(6,"a",7,1));
        pedidos.add(new Pedido(7,"e",6,1));
        pedidos.add(new Pedido(8,"h",8,1));
        // inicio main
        do {
            System.out.println("GESTION DE PEDIDOS DE LA PIZZERIA");
            System.out.println("---------------------------------");
            System.out.println("Se presenta un menú de opciones:");
            System.out.println(
                    "1-Agregar nuevo pedido.\n"+
                    "2-Eliminar pedido.\n"+
                    "3-Actualizar información de un pedido.\n"+
                    "4-Ordenar por tiempo de preparacion (inserción).\n"+
                    "5-Ordenar por precio total (Shellsort).\n"+
                    "6-Ordenar por nombre del cliente (Quicksort).\n"+
                    "7-Imprimir lista completa\n"+
                    "8-Salir.");
            System.out.println("Seleccione a continuación la acción que desea realizar:");
            menu_op = consola.nextInt();
            switch (menu_op) {
                case 1:
                    System.out.println("--------Datos del pedido--------");
                    cargarPedido(pedidos);
                    imprimirPedidos(pedidos);
                    break;
                case 2:
                    EliminarPedido(pedidos);
                    System.out.println("La lista de pedido se ve de la siguiente manera:");
                    imprimirPedidos(pedidos);
                    break;
                case 3:
                    break;
                case 4:
                    ordenarPorTiempo(pedidos);
                    break;
                case 5:
                    ordenarPorPrecio(pedidos);
                    break;
                case 6:
                    ordenarPorNombre(pedidos, 0, pedidos.size() -1); // -1 porque el indice arranca de 0
                    break;
                case 7:
                    imprimirPedidos(pedidos);
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Opcion inválida. Elija de nuevo.");
                    break;
            }
        } while (exit != true);

    }

    // funciones
    public static void cargarPedido(ArrayList<Pedido> pedidos) {
        // declaracion variables
        var consola = new Scanner(System.in);
        String nombre = "";
        int numero = 0;
        float precio = 0;
        float tiempo = 0;
        // inicio
        // obtenemos datoss
        System.out.println("Ingrese el número del pedido:");
        numero = consola.nextInt();
        consola.nextLine();
        System.out.println("Ingresar nombre del cliente:");
        nombre = consola.nextLine();
        System.out.println("Ingrese el tiempo de espera:");
        tiempo = consola.nextFloat();
        System.out.println("Ingrese el precio total:");
        precio = consola.nextFloat();
        // registramos al cliente y lo agregamos a la lista
        Pedido nuevoPedido = new Pedido(numero, nombre, precio, tiempo);
        pedidos.add(nuevoPedido);

    }

    public static void imprimirPedidos(ArrayList<Pedido> lista) {
        System.out.println("------------PEDIDOS-------------");
        System.out.println("Numero\tNombre\tPrecio\tTiempo");
        for (Pedido pedido : lista) {
            System.out.println(pedido);
        }
        System.out.println("---------------------------------\n");
    }

    public static void EliminarPedido(ArrayList<Pedido> lista) {
        // variables
        int eliminar = 0;
        var consola = new Scanner(System.in);
        // inicio
        System.out.println("Ingrese el número del pedido que desea eliminar:");
        eliminar = consola.nextInt();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNumeroPedido() == eliminar) {
                lista.remove(i);
                break;
            }
        }
    }
}
