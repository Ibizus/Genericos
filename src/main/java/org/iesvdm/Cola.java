package org.iesvdm;

import java.util.LinkedList;
import java.util.List;

public class Cola<T> {

    private List<T> cola;

    public Cola(){
        cola = new LinkedList<T>();
    }

    public Boolean estaVacia(){
        return cola.isEmpty();
    }

    public T extraer(){
        if(cola.isEmpty()){
            return null;
        }
        else {
            return cola.remove(cola.size()-1);
        }
    }

    public T primero(){
        if(cola.isEmpty()){
            return null;
        }
        else {
            return cola.get(cola.size()-1);
        }
    }

    public void aniadir(T element){
        cola.add(0, element);
    }

    public List<T> getCola() {
        return cola;
    }
}
