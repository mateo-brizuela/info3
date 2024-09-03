package utils;

public abstract class Potencia {
    public static float cPotencia(float num, int exp){
        if(exp == 0){
            return(1);
        } else{
            if(exp > 0){
                return(num * cPotencia(num,exp-1));
            } else{ // exp < 0
                return(1 / num * cPotencia(num, exp+1));
            }
        }
    }
}
