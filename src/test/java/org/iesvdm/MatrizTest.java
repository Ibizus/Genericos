package org.iesvdm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;


public class MatrizTest {

    // Initialized empty Matriz:
    int rows = 10;
    int col = 10;
    private Matriz<Integer> tested = new Matriz<>(rows, col);

    @Test
    public void constructorFillsMatrizWithNulls(){

        // Assess columns size:
        Assertions.assertEquals(col, tested.getRows().get(0).size());

        // Iterate to assess nulls == (10x10)
        int count = 0;
        for (List<Integer> rows: tested.getRows()) {

            for (Integer posCol: rows) {
                if(posCol == null){
                    count++;
                }
            }
        }
        Assertions.assertEquals((col*rows), count);
    }

    @Test
    public void setIntroduceObjectAndGetFindsIt(){

        // set in correct position:
        tested.set(4,6,500);
        // Assess using get:
        Assertions.assertEquals(500, tested.get(4,6));
        // Assess get brings null from Matriz
        Assertions.assertEquals(null, tested.get(1,1));
        // Assess get returns null if position is not correct:
        Assertions.assertEquals(null, tested.get(20,20));

        // set in out of Matriz position and assess:
        Assertions.assertFalse(tested.set(12, 24, 666));
    }

    @Test
    public void getColumnsReturnProperSize(){
        // Assess that columns are as initialized:
        Assertions.assertEquals(col, tested.columnas());
    }

    @Test
    public void getRowsReturnProperSize(){
        // Assess that rows are as initialized:
        Assertions.assertEquals(rows, tested.filas());
    }

    @Test
    public void toStringPrintsMatriz(){
        // Declare expected:
        String expected =
                """
                        Row0: [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
                        Row1: [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
                        Row2: [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
                        Row3: [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
                        Row4: [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
                        Row5: [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
                        Row6: [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
                        Row7: [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
                        Row8: [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
                        Row9: [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
                        """;

        Assertions.assertEquals(expected, tested.toString());
    }

}
