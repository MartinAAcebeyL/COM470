/**
 * 
 */
package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * @author martin1
 *
 */
public class UtilTest {
	

	/**
	 * Test method for {@link com.example.demo.Util#numero(int)}.
	 */
	@Test
	public void testNumero() {
		Util util = new Util();
		assertEquals(5, util.numero(5), "error");
	}

}
