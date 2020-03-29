package com.javabasico.operaciones;

import java.util.Scanner;

import com.javabasico.operaciones.modelo.Resistencia;


public class App 
{
    public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
    	Resistencia resistencia = new Resistencia();
    	float resistencia1, resistencia2, resistencia3;
    	
    	System.out.println("-------------------------------------------------------");
    	System.out.println("----------------CALCULO DE RESISTENCIAS----------------");
    	System.out.println("-------------------------------------------------------");
    	
    	System.out.print("Ingrese primera resistencia : ");
    	resistencia1 = scan.nextFloat();
    	
    	System.out.print("Ingrese segunda resistencia : ");
    	resistencia2 = scan.nextFloat();
    	
    	System.out.print("Ingrese tercera resistencia : ");
    	resistencia3 = scan.nextFloat();
    	
    	if(resistencia.isMayorToCero(resistencia1) && 
    			resistencia.isMayorToCero(resistencia1) && 
    					resistencia.isMayorToCero(resistencia1)) {
    		
    		float resistenciaTotal = resistencia.calculaResistencia(resistencia1, resistencia2, resistencia3);
    		System.out.println("La resistencia total es de " + resistenciaTotal);
    		
    	}else {
    		
    		System.out.println("Las resistencias no son distintas a cero.");
    		
    	}
    	
    	scan.close();
    }
}
