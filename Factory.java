public class Factory {
    public Factory(){
    }

    public Stack<E> getStack(String entrada){
        if(entrada.equalsIgnoreCase("1")){
            return new ListaCircular();
        }
        else if(entrada.equalsIgnoreCase("2")){
            return new DoblementeEncadenada();
        }
        else if(entrada.equalsIgnoreCase("3")){
            return new SimplementeEncadenada();
        }
        else if(entrada.equalsIgnoreCase("4")){
            return new ArrayList();
        }
        else if(entrada.equalsIgnoreCase("5")){
            return new Vector();
        }
        else if(entrada.equalsIgnoreCase("6")){
            return new Lista();
        }

    }
}