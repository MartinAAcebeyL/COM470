package com.mycompany.ejertestparam;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PalindromoTest {

    @Parameterized.Parameters
    public static List<Object> datos() {
        return Arrays.asList(new Object[][] {
                { "nadan", true }, { "hola", false }, { "salas", true }, { "como", false }, { "oso", true }
        });
    }

    @Parameterized.Parameter(0)
    public String valor1;

    @Parameterized.Parameter(1)
    public boolean esperado;

    Palindromo utils = new Palindromo();

    @Test
    public void testBuscaPalindromo() {
        System.out.println("los parametros son: cadena=" + valor1 + " esperado=" + esperado);
        boolean resultado = utils.buscaPalindromo(valor1);
        assertEquals(esperado, resultado);

    }
}
