package org.iesvdm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

/**
 * Tests that proves the generic stack and it behaviour when
 * adding and removing objects.
 */
public class PilaTest {

    // Initialized Pila
    Pila<Object> tested = new Pila();

    @Test
    public void emptyPilaAfterBeingCreated(){
        Assertions.assertTrue(tested.estaVacia());
    }

    @Test
    public void addObjectsToPila(){
        // First declare some different Objects:
        Integer num = 5;
        String chain = "Hello";
        Double dNum = 8.5d;

        // Try to add them to tested Pila:
        tested.aniadir(num);
        tested.aniadir(chain);
        tested.aniadir(dNum);

        // Assess:
        // (I access to the inner List attribute of Pila in order because tested method is ANIADIR):
        Assertions.assertFalse(tested.pila.isEmpty());
        Assertions.assertEquals(3, tested.pila.size());
        Assertions.assertEquals(num, tested.pila.get(0));
    }

    @Test
    public void getFirstFromPila(){
        // First declare some different Objects:
        String chain = "Hello";
        Double dNum = 8.5d;
        // Try to add them to tested Pila:
        tested.aniadir(chain);
        tested.aniadir(dNum);

        // Assess first object in two different ways:
        Assertions.assertEquals(chain, tested.primero());
        Assertions.assertEquals(chain, tested.pila.get(0));
    }

    @Test
    public void extractFromPila(){

        // First declare an Object:
        Double dNum = 8.5d;
        // Add it to tested Pila:
        tested.aniadir(dNum);

        // try to extract it two times:
        Assertions.assertEquals(dNum, tested.extraer());
        // Second time throws Exception as it is empty:
        Assertions.assertThrows(Exception.class, (Executable) tested.extraer());
    }

    @Test
    public void testToStringMethod(){
        // First declare some different Objects:
        Integer num = 5;
        String chain = "Hello";
        Double dNum = 8.5d;
        // Add them to tested Pila:
        tested.aniadir(num);
        tested.aniadir(chain);
        tested.aniadir(dNum);

        // Assess:
        Assertions.assertEquals("[5] [Hello] [8.5] ", tested.toString());
    }
}
