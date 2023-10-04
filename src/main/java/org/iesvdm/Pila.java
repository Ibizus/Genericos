package org.iesvdm;


/*Escribe una clase Pila genérica usando para ello un atributo del tipo LinkedList. La clase Pila tendrá los siguientes métodos:

        estaVacia(): devuelve true si la pila está vacía y false en caso contrario.
        extraer(): devuelve y elimina el primer elemento de la colección.
        primero(): devuelve el primer elemento de la colección
        aniadir(): añade un objeto por el extremo que corresponda.
        toString(): devuelve en forma de String la información de la colección.*/

import java.util.LinkedList;
import java.util.List;

public class Pila<T>  {

    // ATTRIBUTES:
    List<T> pila = new LinkedList<>();

    // METHODS:
    public boolean estaVacia(){
        return this.pila.isEmpty();
    }

    public T extraer(){
        if(!this.pila.isEmpty()) {
            return this.pila.remove(0);
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
            result+= element;
        }
        return result;
    }
}
