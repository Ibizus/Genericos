package org.iesvdm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RepasoListaOrdenada<E extends Comparable<E>> {


    private List<E> lista;

    public RepasoListaOrdenada(){
        this.lista = new ArrayList<>();
    }

    public void add(E elem){

        this.lista.add(elem);
        Collections.sort(lista);
    }

    public E get(int index){
        return lista.get(index);
    }

    public int size(){
        return lista.size();
    }

    public boolean isEmpty(){
        return lista.isEmpty();
    }

    public boolean remove(E elem){
        try{
            lista.remove(elem);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public int indexOf(E elem){
        try{
            return lista.indexOf(elem);
        }catch (Exception e){
            return -1;
        }
    }

    public String toString(){
        return lista.toString();
    }




}
