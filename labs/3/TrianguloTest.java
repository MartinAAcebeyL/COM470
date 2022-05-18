package com.mycompany.ejertestparam;

import java.util.List;
import org.assertj.core.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TrianguloTest {

    @Parameterized.Parameters
    public static List<Object> datos() {
        return Arrays.asList(new Object[][] {
                { 2, 2, 2, "Equilatero" }, { 3, 3, 2, "Isoceles" }, { 2, 4, 3, "Escaleno" }, { 3, 5, 2, "Escaleno" },
                { 2, 2, 2, "Equilatero" }
        });
    }

    @Parameterized.Parameter(0)
    public int valor1;
    @Parameterized.Parameter(1)
    public int valor2;
    @Parameterized.Parameter(2)
    public int valor3;
    @Parameterized.Parameter(3)
    public String esperado;

    Triangulo utils = new Triangulo();

    @Test
    public void testTipoTriangulo() {
        System.out.println("los parametros son: l1=" + valor1 + " l2=" + valor2 + " l3=" + valor3 + " l4=" + esperado);
        String resultado = utils.tipoTriangulo(valor1, valor2, valor3);
        assertEquals(esperado, resultado);

    }

}
