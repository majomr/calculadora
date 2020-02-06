/*
Maria Jose Morales 19145
Jose Abraham
Hoja de trabajo 2
Clase: main
 */

import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

public class main{
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        //se tendra la operacion que tenga el archivo
        ArrayList<String> data = new ArrayList<String>();
        //stack que se utiliza para manejar los datos
        PilaVectores<String> proceso = new PilaVectores<String>();
        File f = new File("datos.txt");
        Scanner s = null;
        String op = "";
        try{
            s = new Scanner(f);
            op = s.nextLine();
            s.close();
            System.out.println("Postfix: " + op);
        }
        catch(Exception ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        }
        //se agregan los operadores al array
        for (int i = 0; i<op.length() ; i++){
            String l = op.substring(i,i+1);
            if (l.equalsIgnoreCase(" ")) {
                //si es un espacio no agrega nada
            }
            else {
                //si no es un espacio agrega el operador :)
                data.add(l);
            }
        }

        int cantidadOperadores = data.size();

        //recorre todos los operadores
        for(int i=0; i<cantidadOperadores; i++){
            //tiene el valor del operador que toque
            String o = data.get(i);

            if (o.equalsIgnoreCase("0")|| o.equalsIgnoreCase("1")|| o.equalsIgnoreCase("2")|| o.equalsIgnoreCase("3")|| o.equalsIgnoreCase("4")|| o.equalsIgnoreCase("5")|| o.equalsIgnoreCase("6")|| o.equalsIgnoreCase("7")|| o.equalsIgnoreCase("8")|| o.equalsIgnoreCase("9") ){
                //el operador es un int
                proceso.push(o);

            }
            else{
                //el operador es un string (signo de la operacion)
                proceso.push(o);
                String signo = proceso.pop();
                int op2 = Integer.parseInt(proceso.pop());
                int op1 = Integer.parseInt(proceso.pop());
                //dependiendo de que signo es se realiza la operacion
                int resultado = 0;
                if(signo.equalsIgnoreCase("+")){
                    resultado = calculadora.sumar(op1, op2);
                }
                else if(signo.equalsIgnoreCase("-")){
                    resultado = calculadora.restar(op1, op2);
                }
                else if(signo.equalsIgnoreCase("*")){
                    resultado = calculadora.multiplicar(op1, op2);
                }
                else if(signo.equalsIgnoreCase("/")){
                    resultado = calculadora.dividir(op1, op2);
                }
                else {
                    System.out.println("No se encontro ningun signo valido.");
                }
                //se agrega el resultado al stack
                proceso.push(Integer.toString(resultado));
            }
        }
        //termina de recorres todos los operados entonces muestra el esultado final
        System.out.println("El resultado es: " + Integer.parseInt(proceso.pop()));
    }
}