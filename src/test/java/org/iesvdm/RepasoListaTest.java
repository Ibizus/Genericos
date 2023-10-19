package org.iesvdm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RepasoListaTest {

    private RepasoListaOrdenada tested;

    @BeforeEach
    @Test
    public void incializaListaOrdenadaVacia(){
        tested = new RepasoListaOrdenada<>();

        Assertions.assertTrue(tested.isEmpty());
        Assertions.assertEquals(0, tested.size());
    }

    @Test
    public void aniadeOk(){

        int num1 = 80;
        int num2 = 100;
        int num3 = 20;
        tested.add(num1);
        tested.add(num2);
        tested.add(num3);

        Assertions.assertEquals(3, tested.size());
    }

    @Test
    public void listaEstaordenada(){
        int num1 = 80;
        int num2 = 100;
        int num3 = 20;
        tested.add(num1);
        tested.add(num2);
        tested.add(num3);


        Assertions.assertEquals(num3, tested.get(0));
        Assertions.assertEquals(num1, tested.get(1));
        Assertions.assertEquals(num2, tested.get(2));

    }

    @Test
    public void indexOfFunciona(){
        int num1 = 80;
        int num2 = 100;
        int num3 = 20;
        tested.add(num1);
        tested.add(num2);
        tested.add(num3);


        Assertions.assertEquals(0, tested.indexOf(num3));
    }
}
