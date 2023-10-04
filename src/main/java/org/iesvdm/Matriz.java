package org.iesvdm;

import java.util.ArrayList;
import java.util.List;

public class Matriz<T> {

    // ATTRIBUTES:
    private List<List<T>> rows;

    // CONSTRUCTOR:
    public void Matriz(int rows, int col){

        // inicializo el array de arrays:
        this.rows = new ArrayList<List<T>>(rows);
        // seteo los null para que no quede vacío (y poder iterar sobre él):
        for (int i = 0; i < rows; i++) {
            this.rows.add(null);
        }

        // ahora puedo iterar para inicializar las columnas y setearlas:
        for (List<T> row: this.rows){
            // Para cada posición de la fila inicializo un nuevo array (columnas)
            row = new ArrayList<T>(col);
            // seteo un null en cada posicion de todas las columnas
            for (int i = 0; i < col; i++) {
                row.add(null);
            }
        }
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
