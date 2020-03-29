package com.jorgecarmona.javabasico.operaciones.modelo;

import org.junit.Test;

import com.javabasico.operaciones.modelo.Resistencia;

import junit.framework.TestCase;


public class ResistenciaTest extends TestCase {
	
	@Test
	public void testIsMayorToCero() {
		Resistencia resistencia = new Resistencia();
		assertTrue(resistencia.isMayorToCero(52));
	}
	
	@Test
	public void testIsMenorToCero() {
		Resistencia resistencia = new Resistencia();
		assertFalse(resistencia.isMayorToCero(0));
	}
	
	@Test 
	public void testCalculaResistencia() {
		Resistencia resistencia = new Resistencia();
		assertEquals(1.6666666, resistencia.calculaResistencia(5, 5, 5), 7);
	}


	
}
