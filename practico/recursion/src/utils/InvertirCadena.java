package utils;

public class InvertirCadena {
    public static void main(String[] args) {
        String plabra = "Hola";
        String iPalabra = iCadena(plabra); //String que contiene la palabra invertida
        System.out.println("String original: "+ plabra);
        System.out.println("String invertido: " + iPalabra);

    }

    public static String iCadena(String palabra){
        if (palabra.isEmpty()) {
            return palabra;
        }else{
            return iCadena(palabra.substring(1)) + palabra.charAt(0);
        }
    }
}
