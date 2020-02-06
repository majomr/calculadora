/*
Maria Jose Morales 19145
Jose Abraham
Hoja de trabajo 2
Clase: calculadora
 */

public class Calculadora implements iCalculadora{

    public Calculadora(){

    }
    
    public int sumar(int a, int b){
        return a+b;
    }
    
    public int restar(int a, int b){
        return a-b;
    }
    
    public int dividir(int a, int b){
        return a/b;
    }
    
    public int multiplicar(int a, int b){
        return a*b;
    }

}
