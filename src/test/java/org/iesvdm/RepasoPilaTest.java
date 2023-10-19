package org.iesvdm;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RepasoPilaTest {

    public RepasoPila<Object> nuevaPila;

    @BeforeEach
    @Test
    public void iniciaPilaVacia(){

        nuevaPila = new RepasoPila<>();
    }

    @Test
    public void pilaVaciaAlIniciarse(){

        Assertions.assertTrue(nuevaPila.estaVacia());
    }

    @Test
    public void elementosAñadidosCorrectamente(){

        String cadena = "Hola";
        int num = 5;
        double decimal = 8.2d;

        nuevaPila.aniadir(cadena);
        nuevaPila.aniadir(num);
        nuevaPila.aniadir(decimal);

        Assertions.assertEquals(3, nuevaPila.getPila().size());
    }

    @Test
    public void primeroDevuelveElPirmerElemntoQueEntro(){

        String cadena = "Hola";
        int num = 5;
        double decimal = 8.2d;
        nuevaPila.aniadir(cadena);
        nuevaPila.aniadir(num);
        nuevaPila.aniadir(decimal);

        Assertions.assertEquals(cadena, nuevaPila.primero());
    }

    @Test
    public void extraeDevuelveElUltimoElemntoIntroducido(){

        String cadena = "Hola";
        int num = 5;
        double decimal = 8.2d;
        nuevaPila.aniadir(cadena);
        nuevaPila.aniadir(num);
        nuevaPila.aniadir(decimal);

        Assertions.assertEquals(decimal, nuevaPila.extraer());
        // se ha eliminado el elemento:
        Assertions.assertEquals(2, nuevaPila.getPila().size());
    }

    @Test
    public void toStringIteraEImprimeBien(){

        String cadena = "Hola";
        int num = 5;
        double decimal = 8.2d;
        nuevaPila.aniadir(cadena);
        nuevaPila.aniadir(num);
        nuevaPila.aniadir(decimal);

        String expected = "Pila: [" + decimal + "] [" + num + "] [" + cadena + "]";

        Assertions.assertEquals(expected, nuevaPila.toString());
    }

}
