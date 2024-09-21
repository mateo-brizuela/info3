package proyecto3.src;

/* 
clase pila: es una clase encargada de gestionar una lista enlazada, pero en formato de pila

funciones:
    +isEmpty -> verifica si la pila esta vacia
    +makeEmpty -> borra todos los elementos de la pila
    +push -> agrega un elementonuevo en la pila
    +pop -> borra el ultimo elemento ingresado en la pila
    +top -> devuelve el ultimo elemento ingresado en la pila
    
*/
public class Pila {
    NodoPedido tos; // top of stack


    public boolean isEmpty(){
        return tos == null;
    }

    public void makeEmpty(){
        tos = null;
    }

    public void push(NodoPedido pIngresado /*pedido ingresado */){
        if (isEmpty()) {
            System.out.println("no hay elementos en la pila");
            System.out.println("se va a agregar el primer elemento");
            tos = pIngresado;  
        }else{
            System.out.println("se va a agregar un nuevo elemento a la pila");
            pIngresado.next = tos;
            tos = pIngresado;
            System.out.println("se agrego un nuevo elemento en la pila");
        }
    }

    public void pop(){
        if (isEmpty()) {
            System.out.println("no hay elementos en la pila, no se puede eliminar nada");
        }else{
            tos = tos.next;
        }
    }

    public NodoPedido top(){
        if (isEmpty()) {
            System.out.println("no hay pedidos en la cola para mostrar");
            return null;
        }else{
            System.out.println("se retorna el top of stack");
            return tos;
        }
    }

}
