package com.javabasico.operaciones.modelo;

public class Resistencia {

	public Boolean isMayorToCero(float resistencia) {
		boolean isMayorToCero = true;
		if(resistencia <= 0) {
			isMayorToCero = false;
		}
		return isMayorToCero;
	}
	
	public float calculaResistencia(float resistencia1, float resistencia2, float resistencia3) {
		float resistenciaTotal = 1/((1/resistencia1) +1/resistencia2 + 1/resistencia3);
		return resistenciaTotal;
	}

}
