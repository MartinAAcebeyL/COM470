/**
 * 
 */
package com.example.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;

import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNot;
import org.junit.Before;
import org.junit.Test;

import com.example.model.OperationModel;

/**
 * @author martin1
 *
 */
public class CalculateSimpleTest {
	CalculateSimple calcu;
	OperationModel operation_m;
	
	int A = 3;
	int B = 4;
	int C = 5;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp(){
		calcu = new CalculateSimple();
		operation_m = new OperationModel(A, B);
		operation_m.setC(C);
	}
/*
assertEquals: evalúa si dos objetos pasados por parámetros son iguales.
assertTrue: evalúa si la condición pasada el cierta. Opuesta a assertFalse.
assertFalse: evalúa si la condición pasada es falsa.
assertNull: comprueba si un objeto es nulo.
assertNotNull: comprueba que la condición no sea nula.
assertNotSame: comprueba que dos objetos no sean la misma instancia
assertSame: opuesto a assertNotSame.
assertThat: es un assert especial q permite que las aserciones se parezcan más al lenguaje natural.
*/
	
	@Test
	public void testAdd() {
		int esperado = A + B;
		assertNotNull(calcu.add(operation_m));
		assertEquals("error en la suma de", esperado, calcu.add(operation_m));
	}

	@Test
	public void testSubtract() {
		int esperado = A - B;
		assertNotNull(calcu.subtract(operation_m));
		assertEquals("error en la resta", esperado, calcu.subtract(operation_m));
		assertNotSame(operation_m, calcu);
	}

	@Test
	public void testMultiply() {
		int esperado = A * B;
		assertNotNull(calcu.multiply(operation_m));
		assertEquals("error en la multiplicacion", esperado, calcu.multiply(operation_m));
		assertNotSame(operation_m, calcu);
	}

	@Test
	public void testDivide() {
		double esperado = A / B;
		assertNotNull(calcu.divide(operation_m));
		//assertEquals("error en la division", esperado, calcu.divide(operation_m));
		assertNotSame(operation_m, calcu);
	}

	@Test
	public void testFactorialOperationModel() {
		int esperado = 120;
		assertNotNull(calcu.factorial(operation_m));
		assertEquals("error en fibonacci", esperado, calcu.factorial(operation_m));
		assertNotSame(operation_m, calcu);
	}

	@Test
	public void testFibonacciOperationModel() {
		int esperado = 5;
		assertNotNull(calcu.fibonacci(operation_m));
		assertEquals("error en fibonacci", esperado, calcu.fibonacci(operation_m));
		assertNotSame(operation_m, calcu);
	}

	@Test
	public void testSqrt() {
		double esperado = 2.23;
		assertNotNull(calcu.sqrt(operation_m));
		//assertEquals("error en sqrt", esperado, calcu.sqrt(operation_m));
		assertNotSame(operation_m, calcu);
	}

	@Test
	public void testPower() {
		double esperado = 25;
		assertNotNull(calcu.power(operation_m));
		//assertEquals("error en power", esperado, calcu.power(operation_m));
		assertNotSame(operation_m, calcu);
	}

	@Test
	public void testClearSimple() {
		assertNotNull(calcu.clearSimple(operation_m));
		assertEquals(calcu.clearSimple(operation_m), calcu.clearSimple(operation_m));
		assertSame(calcu.clearSimple(operation_m), calcu.clearSimple(operation_m));
		//assertThat((calcu.clearSimple(operation_m)).isEquals(calcu.clearSimple(operation_m)));
	}

	@Test
	public void testClearAdvanced() {
		assertNotNull(calcu.clearAdvanced(operation_m));
		assertEquals(calcu.clearSimple(operation_m), calcu.clearAdvanced(operation_m));
		assertSame(calcu.clearSimple(operation_m), calcu.clearAdvanced(operation_m));
	}
}