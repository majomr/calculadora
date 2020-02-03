/*
Maria Jose Morales 19145
Jose Abraham
Hoja de trabajo 2
Clase: PilaVectores
 */
import java.util.ArrayList;
public class PilaVectores<E> implements iPilaVectores<E>{
    private ArrayList<E> stack;
    public PilaVectores(){
        stack = new ArrayList<E>();
    }

    public void push(E elemento){
        stack.add(elemento);
    }

    public E pop(){
        int t = stack.size();
        return stack.remove(t-1);
    }

    public E peek(){
        int t = stack.size();
        return stack.get(t-1);
    }

    public boolean empty(){
        return stack.isEmpty();
    }

    public int size(){
        return stack.size();
    }
}