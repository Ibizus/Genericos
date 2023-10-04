package org.iesvdm;

import java.util.ArrayList;
import java.util.List;

public class Matriz<T> {

    // ATTRIBUTES:
    private List<List<T>> rows;

    // CONSTRUCTOR:
    public void Matriz(int rows, int col){

        this.rows = new ArrayList<List<T>>(rows);

        // Esto tengo que hacerlo iterando sobre el List del List (doble bucle)
       /* }

        for (List<T> row: this.rows){
            row = new ArrayList<T>(col);
        }*/
    }

    // METHODS:
    public boolean set(int rowPos, int colPos, T elem){

        try{
            this.rows.get(rowPos).set(colPos, elem);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public T get(int rowPos, int colPos){

        try{
            return rows.get(rowPos).get(colPos);
        }catch (Exception e){
            return null;
        }
    }

    public Integer columnas(){
        return this.rows.get(0).size();
    }

    public Integer filas(){
        return this.rows.size();
    }

    @Override
    public String toString() {
        String result = "";

        for (List<T> row: this.rows){

            result += "Row: ";
            for (T elem: row) {
                result += "[" + elem.toString() + "]";
            }
        }
        return result;
    }
}
