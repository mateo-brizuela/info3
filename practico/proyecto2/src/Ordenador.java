package practico.proyecto2.src;
import java.util.ArrayList;

public class Ordenador {

    public static void ordenarPorTiempo(ArrayList<Pedido> lista){
        int i = 0, j = 0;
        for(i = 0; i < lista.size(); i++){ // recorre toda la lista de elementos
            var temp = lista.get(i); // guarda el elemento que vamos a comparar
            for(j = i; j > 0 && lista.get(j-1).getTiempo() > temp.getTiempo(); j--){ // empieza desde uno antes y debe recorrer todos lo que tenga detrás
                lista.set(j,lista.get(j-1));
                // lista.set(j-1,temp); // no hace falta, esto simplemente consume una op de mas
            }
            lista.set(j,temp);
        }
    }

    public static void ordenarPorPrecio(ArrayList<Pedido> lista){
        // variables para recorrer la lista
        int i = 0;
        int j = 0;
        int n = lista.size();
        int gap = n;
        // variable para intercambiar elementos de la lista 
        Pedido aux;

        for(gap /= 2; gap > 0; gap /=2){
            // este for empieza a contar desde el gap, luego i se incrementa en uno hasta llegar al final de la lista
            for(i = gap; i < n; i++){
                // pregunta si el elemento de la derecha es menor que el de la izquierda -
                // de ser asi se inicia el tercer bucle
                if (lista.get(i).getPrecioTotal() < lista.get(i - gap).getPrecioTotal()) {

                    // el tercer bucle empieza a hacer intercambios siempre y cuando el elemento de la derecha -
                    // sea menor que el elemento de la izquierda o el indice este por apuntar fuera del rango de la lista
                    for(j = i; (j >= gap) && lista.get(j).getPrecioTotal() < lista.get(j - gap).getPrecioTotal();j -= gap){
                        // se intercambia el elemento de la derecha con el de la izquierda
                        aux = lista.get(j - gap);
                        lista.set(j - gap, lista.get(j));
                        lista.set(j, aux);
                    }
                }
            }
        }
    }
}
