package proyecto3.src;
// esta clase va a gestinar la cola
public class Cola {
    private NodoPedido head; //comienzo de la cola
    private NodoPedido back; //fin de la cola
    private int cont; //cuenta la cantidad de elementos historico agregados en la cola
                      // esto con el objetivo degenerar numeros de pedido unicos automaticamente

    public boolean isEmpty(){
        return head == null;
    }

    public void enqueue(NodoPedido pIngresado){ //recibe el pedido ingresado
        if (isEmpty()) {
            System.out.println("no hay pedidos en la cola, se crea un nuevo head");
            head = pIngresado;
            back = pIngresado;
            System.out.println("el pedido se registro correctamente");
        }else{
            back.next = pIngresado;
            back = pIngresado;
            System.out.println("el pedido se registro correctamente");
        }

        if (pIngresado.getNumeroPedido() == 0) {
            cont++;
            pIngresado.setNumeroPedido(cont);
        }
        
    }

    public void dequeue(){
        if (isEmpty()) {
            System.out.println("no hay pedidos en la cola para eliminar");
        }else if (head == back) {
            //System.out.println("solo queda un elemento, se va a eliminar");
            head = back = null;
            System.out.println("se elimino el unico elemento de la cola");
        }else {
            head = head.next; 
        }
    }

    public NodoPedido top(){
        if (isEmpty()) {
            System.out.println("no hay elementos en la cola");
            return null;
        }else
        {
            return head;
        }
    }

    public void imprimirCola(){
        NodoPedido aux; //variable para recorrer la cola
        if (isEmpty()) {
            System.out.println("no hay elementos en la cola para mostrar");
        }else{
            aux = head;
            while (aux != null) {
                System.out.println(aux);
                aux = aux.next;
            }
        }
    }
}
