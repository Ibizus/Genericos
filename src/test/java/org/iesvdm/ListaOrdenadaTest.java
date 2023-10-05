package org.iesvdm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test that prove all the methods implemented in OrderedList,
 * checking that it is always ordered but works as a normal List
 */
public class ListaOrdenadaTest {

    // First initialize List.
    ListaOrdenada<Integer> testedList = new ListaOrdenada<>();

    @Test
    public void initialListIsEmpty(){
        Assertions.assertTrue(testedList.isEmpty());
    }

    @Test
    public void addInsertObjectAndSorts(){
        // Add some Objects without ordered:
        testedList.add(8);
        testedList.add(2);

        // Assess size() and get() to check order:
        Assertions.assertEquals(2, testedList.size());
        Assertions.assertEquals(2, testedList.get(0));
    }

    @Test
    public void indexOfReturnsExpectedIndex(){
        // Add some Objects without ordered:
        testedList.add(8);
        testedList.add(2);

        // Assess indexOf returns proper index:
        Assertions.assertEquals(1, testedList.indexOf(8));
        // Assess it returns -1 when not found
        Assertions.assertEquals(-1, testedList.indexOf(5));
    }

    @Test
    public void removeWorksAsExpected(){
        // Add some Objects without ordered:
        testedList.add(8);
        // Assess when object exists and when not:
        Assertions.assertTrue(testedList.remove(8));
        Assertions.assertFalse(testedList.remove(5));
    }

    @Test
    public void toStringPrintsTheListProperly(){
        // Add some Objects without ordered:
        testedList.add(8);
        testedList.add(2);
        testedList.add(5);
        testedList.add(12);

        String expected = "[2][5][8][12]";
        // Assess return of toString:
        Assertions.assertEquals(expected, testedList.toString());
    }

}
