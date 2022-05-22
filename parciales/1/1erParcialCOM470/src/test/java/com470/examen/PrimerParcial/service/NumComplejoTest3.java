package com470.examen.PrimerParcial.service;

import java.util.List;
import org.assertj.core.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class NumComplejoTest3 {
    public NumComplejoTest3() {
    }

    @Parameterized.Parameters
    public static List<Object> datos() {
        return Arrays.asList(new Object[][] {
                { 1, 2, 3, 4 }, { 10, 1, 43, 502 }, { 51, 51, 23, 62 }, { 1, 11, 15, 12 }, { 52, 13, 50, 20 },
                { 221, 132, 388, 63 }, { 12, 14, 11, 51 }, { 52, 54, 53, 52 }, { 58, 100, 5, 32 }, { 5, 33, 72, 26 }
        });
    }

    @Parameterized.Parameter(0)
    public int a;
    @Parameterized.Parameter(1)
    public int b;
    @Parameterized.Parameter(2)
    public int c;
    @Parameterized.Parameter(3)
    public int d;

    @Test
    public void testSumar() {
    	
        NumeroComplejo complejo = new NumeroComplejo(a, b);
        NumeroComplejo complejo2 = new NumeroComplejo(c, d);
        String esperado = String.valueOf(a + c) + "+" + String.valueOf(b + d);
        NumeroComplejo resultado = complejo.sumar(complejo2);
        String res = resultado.getParteReal() + "+" + resultado.getParteImaginaria();
        assertEquals(esperado, res);
    }

    @Test
    public void testRestar() {
    	NumeroComplejo complejo = new NumeroComplejo(a, b);
    	NumeroComplejo complejo2 = new NumeroComplejo(c, d);
        String esperado = String.valueOf(a - c) + "+" + String.valueOf(b - d);
        NumeroComplejo resultado = complejo.restar(complejo2);
        String res = resultado.getParteReal() + "+" + resultado.getParteImaginaria();
        assertEquals(esperado, res);
    }

}
