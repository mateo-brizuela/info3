package utils;

public class SumaNumerosNaturales {
    public static void main(String[] args) {
        int numero = 5;
        int resultado = 0;
        resultado = CNumerosNaturales(numero);
        System.out.println("el resultado de sumar todos los numeros"+
            "naturales desde el "+ numero +" es "+ resultado);
    }

    public static int CNumerosNaturales(int n){
        if (n == 1) {
            return 1;
        }else
        {
            return n + CNumerosNaturales(n-1);
        }
    }
}
