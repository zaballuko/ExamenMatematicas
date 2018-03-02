package com.clase.test;

import static org.junit.Assert.*;

import com.clase.david.Matematica;

public class Test {

	@org.junit.Test
	public void test1() {
		int a = 0;
		int b = 0;

		try {

			Matematica matematica = new Matematica();

			matematica.suma(5, 10);
			fail("Error");

		} catch (ArithmeticException ex) {
			
			System.out.print("Introduce un valor");

		}

	}
	public void test2() {
		int a = 0;
		int b = 0;

		try {

			Matematica matematica = new Matematica();

			matematica.esmayor(5, 5);
			fail("Error");

		} catch (ArithmeticException ex) {
			
			System.out.print("Introduce un valor");

		}

	}
	

}
