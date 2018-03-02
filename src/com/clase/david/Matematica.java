package com.clase.david;
import java.lang.reflect.Array;


	/**
	 * @version 1.0
	 */

	/**
	@author David zabal
	*/

public class Matematica {

	private int[] resultados;
	private boolean esmayor;

	/**
	 * @return the resultados
	 */
	public int[] getResultados() {
		return resultados;
	}

	/**
	 * @param resultados
	 *            the resultados to set
	 */
	public void setResultados(int[] resultados) {
		this.resultados = resultados;
	}

	/**
	 * @return the esmayor
	 */
	public boolean isEsmayor() {
		return esmayor;
	}

	/**
	 * @param esmayor
	 *            the esmayor to set
	 */
	public void setEsmayor(boolean esmayor) {
		this.esmayor = esmayor;
	}

	/**
	 * @param Realiza una suma de dos variabes tipo int y te devuelve un resultado tipo int
	 */
	

	public int suma(int a, int b) {

		int resultadoSuma = a + b;

		return resultadoSuma;
		
	}

	/**
	 * @param Compara dos variables de tipo int y si una es mayor que la otra de vuelve true y si es menor devuelve false
	 */

	public boolean esmayor(int a, int b) {

		if (a > b) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @param Devuelve un array de sumas de tipo int
	 */

	
	public int[] arraySumas() {

		return resultados;
	}

}
