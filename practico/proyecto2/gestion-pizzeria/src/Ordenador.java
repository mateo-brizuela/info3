import java.util.ArrayList;

public abstract class Ordenador {

    public static void ordenarPorTiempo(ArrayList<Pedido> lista){
        for(int i = 0; i < lista.size(); i++){ // recorre toda la lista de elementos
            var temp = lista.get(i); // guarda el elemento que vamos a comparar
            for(int j = i; j > 0 && lista.get(j-1).getTiempo() > temp.getTiempo(); j--){ // empieza desde uno antes y debe recorrer todos lo que tenga detrás
                lista.set(j,lista.get(j-1));
                // lista.set(j-1,temp); // no hace falta, esto simplemente consume una op de mas
            }
        }
    }
    
}
