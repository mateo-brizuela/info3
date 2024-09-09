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
        int izq = 0;
        int der = 0;
        int n = lista.size();
        int gap = n;
        //variables para realizar los intercambios en los elementos de la lista
        int izq2 = 0;
        int der2 = 0;
        Pedido aux;

        while (gap != 0) {
            gap /= 2;
            izq = 0;
            der = izq + gap;

            //inicio el segundo bucle, que va a recorrer la lista hasta el final de la misma
            while (der < n) {
                if (lista.get(izq).getPrecioTotal() > lista.get(der).getPrecioTotal()) {
                    // le doy valor a los indices auxiliares para intercambiar los elementos hacia la izquierda
                    izq2 = izq;
                    der2 = der;
                    
                    // recorre la lista hacia la izquierda hasta encontrar un elemento menor
                    // o hasta salir del rango de la lista
                    while (lista.get(der2).getPrecioTotal() < lista.get(izq2).getPrecioTotal() && izq2 >= 0) {
                        //intercambio
                        aux = lista.get(izq2);
                        lista.set(izq2, lista.get(der2));
                        lista.set(der2, aux);
                        izq2 -= gap;
                        der2 -= gap;
                    }

                }
                izq++;
                der++;
            }
        }

    }

}
