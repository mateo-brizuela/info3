package utils;

public class SerieFibonacci {
    public static void main(String[] args) {
        int numero = 6;
        int resultado = 0;
        resultado = fibonacci(numero);
        System.out.println("el numero "+ numero +
        " de la sucesion Fibonacci es " + resultado);
    }
    
    public static int fibonacci(int n){
        if (n == 1 || n == 2) {
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
