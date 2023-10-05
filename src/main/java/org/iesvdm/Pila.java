package org.iesvdm;

import java.util.LinkedList;
import java.util.List;

/**
 * Pila genérica que implementa los métodos que permiten
 * el comportamiento de una lista de tipo cola
 * @param <T>
 */
public class Pila<T>  {

    // ATTRIBUTES:
    List<T> pila = new LinkedList<>();

    // METHODS:
    public boolean estaVacia(){
        return this.pila.isEmpty();
    }

    public T extraer(){
        if(!this.pila.isEmpty()) {
            return this.pila.remove(pila.size()-1);
        }
        else {
            return null;
        }
    }

    public T primero(){
        if(!this.pila.isEmpty()) {
            return this.pila.get(0);
        }
        else {
            return null;
        }
    }

    public void aniadir(T element){
        this.pila.add(element);
    }

    @Override
    public String toString() {
        String result = "";
        for(T element :this.pila){
            result+= "[" + element + "] ";
        }
        return result;
    }
}
