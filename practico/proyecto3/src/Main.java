package proyecto3.src;
import java.util.*;
import static proyecto3.src.GestionadorPedidos.*;

public class Main {
    public static void main(String[] args) {
        Cola pPendientes = new Cola();
        Pila pDespachados = new Pila();
        Scanner consola = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 8) {
            System.out.println("seleccione una opcion:");
            System.out.println("1) agregar un pedido");
            System.out.println("2) preparar un pedido");
            System.out.println("3) deshacer un pedido");
            System.out.println("4) mostrar pedidos pendientes");
            System.out.println("8) salir");
            opcion = consola.nextInt();

            switch (opcion) {
                case 1:
                    agregarPedido(pPendientes);
                    break;

                case 2:
                    prepararPedido(pPendientes, pDespachados);
                    break;

                case 3:
                    deshacerPedido(pPendientes, pDespachados);
                    break;
                
                case 4:
                    mostrarPendientes(pPendientes);
                    break;
            
                default:
                    System.out.println("no es una opcion valida, por favor seleccione otra opcion");
                    break;
            }
            
        }

    }
}
