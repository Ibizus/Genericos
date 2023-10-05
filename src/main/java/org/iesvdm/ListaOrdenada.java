package org.iesvdm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Lista genérica que se ordena de forma automática
 * @param <E>
 */
public class ListaOrdenada <E extends Comparable<E>> {

    // ATTRIBUTES:
    private List<E> lista;

    // CONSTRUCTOR:
    public ListaOrdenada(){
        this.lista = new LinkedList<E>();
    }

    // METHODS:
    public void add(E elem){
        lista.add(elem);
        Collections.sort(this.lista);
    }

    public E get(int index){

        try{
            return lista.get(index);
        }catch (Exception e) {
            return null;
        }
    }

    public int size(){
        return this.lista.size();
    }

    public boolean isEmpty(){
        return this.lista.isEmpty();
    }

    public boolean remove(E elem){
        return this.lista.remove(elem);
    }

    public int indexOf(E elem){
        return this.lista.indexOf(elem);
    }

    @Override
    public String toString(){
        String result = "";

        for (E elem:this.lista){
            result+= "[" + elem.toString() + "]";
        }
        return result;
    }

}
