package com470.examen.PrimerParcial.service;

import java.util.List;
import org.assertj.core.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class NumeroComplejoTest2 {
	@Parameterized.Parameters
    public static List<Object> datos() {
        return Arrays.asList(new Object[][] {
                { 5, 8, 2, 5 }, { 15, 3, 5, 33 }, { 7, 7, 2, 2 }, { 4, 4, 4, 4 }, { 3, 1, 3, 1 },
                { 6, 1, 4, 6 }, { 5, 5, 6, 7 }, { 4, 7, 8, 9 }, { 6, 12, 5, 2 }, { 100, 3, 2, 25 }
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
