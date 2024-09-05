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

}
