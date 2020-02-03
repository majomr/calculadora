/*
Maria Jose Morales 19145
Jose Abraham
Hoja de trabajo 2
Clase: interfaz pila vectores
 */

public interface iPilaVectores<E>{
    public void push(E elemento);
    public E pop();
    public E peek();
    public boolean empty();
    public int size();
}