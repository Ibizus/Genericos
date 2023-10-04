package org.iesvdm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

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


}
