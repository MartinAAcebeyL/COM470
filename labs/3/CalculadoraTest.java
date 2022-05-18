package com.mycompany.ejertestparam;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CalculadoraTest {

    @Parameterized.Parameters
    public static List<Object> datos() {
        return Arrays.asList(new Object[][] {
                { 8, 3 }, { 4, 2 }, { 2, 1 }, { 1, 0 }, { 4, 4 }
        });
    }

    @Parameterized.Parameter(0)
    public int valor1;

    @Parameterized.Parameter(1)
    public int valor2;

    Calculadora utils = new Calculadora();

    @Test
    public void testDivision() {
        try {
            System.out.println("los parametros son: l1=" + valor1 + " l2=" + valor2);
            int resultado = utils.division(valor1, valor2);
            assertEquals(valor1 / valor2, resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            assertEquals("No se puede dividir entre 0", e.getMessage());
        }
    }

    @Test
    public void testMultimplicacion() {
        System.out.println("los parametros son: l1=" + valor1 + " l2=" + valor2);
        int resultado = utils.multimplicacion(valor1, valor2);
        assertEquals(valor1 * valor2, resultado);
    }

    @Test
    public void testResta() {
        System.out.println("los parametros son: l1=" + valor1 + " l2=" + valor2);
        int resultado = utils.resta(valor1, valor2);
        assertEquals(valor1 - valor2, resultado);
    }

    @Test
    public void testSuma() {
        System.out.println("los parametros son: l1=" + valor1 + " l2=" + valor2);
        int resultado = utils.suma(valor1, valor2);
        assertEquals(valor1 + valor2, resultado);
    }
}
