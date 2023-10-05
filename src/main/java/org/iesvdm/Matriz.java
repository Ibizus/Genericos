package org.iesvdm;

import java.util.ArrayList;
import java.util.List;

/**
 * Matriz bidimensional genérica que se inicializa rellena de nulls
 * según el tamaño indicado en el constructor
 * @param <T>
 */
public class Matriz<T> {

    // ATTRIBUTES:
    private List<List<T>> rows;

    // CONSTRUCTOR:
    public Matriz(int rows, int col){

        // inicializo el array de arrays:
        this.rows = new ArrayList<List<T>>(rows);
        // seteo los null para que no quede vacío (y poder iterar sobre él):
        for (int i = 0; i < rows; i++) {
            // Para cada posición de la fila inicializo un nuevo array (columnas)
            this.rows.add(new ArrayList<T>(col));
            // seteo un null en cada posicion de todas las columnas
            for (int j = 0; j < col; j++) {
                this.rows.get(i).add(null);
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
        int count = 0;

        for (List<T> row: this.rows){

            result += "Row" + count + ": ";
            for (T elem: row) {
                if(elem == null){
                    result+= "[ ]";
                }else {
                    result += "[" + elem.toString() + "]";
                }
            }
            result+="\n";
            count++;
        }
        return result;
    }

    // GETTER:
    public List<List<T>> getRows() {
        return rows;
    }
}
