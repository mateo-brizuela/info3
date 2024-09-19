package proyecto3.src;
// esta clase va a gestinar la cola
public class Cola {
    private NodoPedido head; //comienzo de la cola
    private NodoPedido back; //fin de la cola
    private int cont; //cuenta la cantidad de elementos en la cola

    public boolean isEmpty(){
        return head == null;
    }

    public void enqueue(NodoPedido pIngresado){ //recibe el pedido ingresado
        if (isEmpty()) {
            System.out.println("no hay pedidos en la cola, se crea un nuevo head");
            head = pIngresado;
            back = pIngresado;
            cont++;
            System.out.println("el pedido se registro correctamente");
        }else{
            back.next = pIngresado;
            back = pIngresado;
            cont++;
            System.out.println("el pedido se registro correctamente");
        }
        
    }

    public void dequeue(){
        if (isEmpty()) {
            System.out.println("no hay pedidos en la cola para eliminar");
        }else if (head == back) {
            //System.out.println("solo queda un elemento, se va a eliminar");
            head = back = null;
            cont--;
            System.out.println("se elimino el unico elemento de la cola");
        }else {
            head = head.next; 
            System.out.println("se elimino el primer elemento de la cola");
        }
    }

    public NodoPedido top(){
        if (isEmpty()) {
            System.out.println("no hay elementos en la cola");
            return null;
        }else
        {
            System.out.println("se retorna head");
            return head;
        }
    }
}
