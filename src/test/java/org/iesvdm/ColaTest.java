package org.iesvdm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ColaTest {

    private Cola<Object> tested;

    @BeforeEach
    @Test
    public void inicializaCola(){

        tested = new Cola<>();
    }

    @Test
    public void colaEmpiezaVacia(){

        Assertions.assertTrue(tested.estaVacia());
        Assertions.assertTrue(tested.getCola().isEmpty());
    }

    @Test
    public void aniadeOk(){

        Integer num = 5;
        String chain = "Hello";
        Double dNum = 8.5d;
        tested.aniadir(num);
        tested.aniadir(chain);
        tested.aniadir(dNum);

        Assertions.assertEquals(3, tested.getCola().size());
    }

    @Test
    public void primero(){

        Integer num = 5;
        String chain = "Hello";
        Double dNum = 8.5d;
        tested.aniadir(num);
        tested.aniadir(chain);
        tested.aniadir(dNum);
        // returns the next element to exit, (the first to entrance, num)
        Assertions.assertEquals(5, tested.primero());
    }

    @Test
    public void extraeElPrimeroQUeEntro(){

        Integer num = 5;
        String chain = "Hello";
        Double dNum = 8.5d;
        tested.aniadir(num);
        tested.aniadir(chain);
        tested.aniadir(dNum);
        // returns the next element to exit, (the first to entrance, num)
        Assertions.assertEquals(5, tested.extraer());
        Assertions.assertEquals(2, tested.getCola().size());
    }
}
