package com470.examen.PrimerParcial.service;

import java.util.List;
import org.assertj.core.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class NumeroComplejoTest {

	
	@Parameterized.Parameters
	 public static List<Object> datos() {
        return Arrays.asList(new Object[][]{
            {new NumeroComplejo(5, 5)}, {new NumeroComplejo(3, 7)}, {new NumeroComplejo(7, 3)}, {new NumeroComplejo(1, 2)}
        });
    }
	/*
	 ,
            {new NumeroComplejo(8, 5)}, {new NumeroComplejo(12, 54)}, {new NumeroComplejo(54, 50)}, {new NumeroComplejo(7, 8)},
            {new NumeroComplejo(12, 53)}, {new NumeroComplejo(5, 9)}, {new NumeroComplejo(6, 3)}, {new NumeroComplejo(1, 1)},
            {new NumeroComplejo(56, 5)}, {new NumeroComplejo(125, 5)}, {new NumeroComplejo(51, 95)}
	 * */
	
	@Parameterized.Parameter(0)
    public NumeroComplejo num;
	
	int a = 5, b = 8;
	NumeroComplejo numero1 = new NumeroComplejo(a, b);

	@Test
	public void testGetParteReal() {
		//numero1 = numero1.sumar(num);
		System.out.println("real: "+ numero1.getParteReal() +" img: "+numero1.getParteReal());
		assertNotNull(numero1.getParteReal());
		assertNotNull(num.getParteReal());
	}

	@Test
	public void testGetParteImaginaria() {
		assertNotNull(numero1.getParteImaginaria());
		assertNotNull(num.getParteImaginaria());
	}

	@Test
	public void testSumar() {
		NumeroComplejo n = new NumeroComplejo(numero1.getParteReal() + num.getParteReal(), numero1.getParteImaginaria() + num.getParteImaginaria());
		assertNotSame(numero1.sumar(num), n );
		assertNotNull(numero1.sumar(num));
		//assertEquals((numero1.sumar(num)).getParteReal(), Matchers.is(numero1.getParteReal()+ num.getParteReal()));
	}

	@Test
	public void testRestar() {
		NumeroComplejo n = new NumeroComplejo(numero1.getParteReal() - num.getParteReal(), numero1.getParteImaginaria() - num.getParteImaginaria());
		assertNotSame(numero1.restar(num), n );
		assertNotNull(numero1.restar(num));
		//assertThat(numero1.restar(num).getParteReal(), Matchers.is(num.getParteReal() - numero1.getParteReal()));
	}

}
