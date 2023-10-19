package org.iesvdm;

import java.util.LinkedList;
import java.util.List;

public class RepasoPila<T>{

    private List<T> pila;

    public RepasoPila() {
        this.pila = new LinkedList<T>();
    }


    public Boolean estaVacia(){

        Boolean vacia = true;

        if(this.pila.size()>0){
            vacia = false;
        }
        return vacia;
    }

    public T extraer(){

        if(this.pila.size()==0){
            return null;
        }
        else{
            return this.pila.remove(0);
        }
    }

    public T primero(){

        if(this.pila.size()==0){
            return null;
        }
        else{
            return this.pila.get(this.getPila().size()-1);
        }
    }

    public void aniadir(T element){

        this.pila.add(0, element);
    }

    @Override
    public String toString() {

        String result = "Pila:";

        for (T element:this.getPila()) {

            result+= " [" + element.toString() + "]";
        }
        return result;
    }

    public List<T> getPila() {
        return pila;
    }
}
