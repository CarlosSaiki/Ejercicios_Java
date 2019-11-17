/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.Scanner;

/**
 *
 * @author Shun'ei
 */
public class Ejes {
    public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);

		// Ingresar la cantidad de posiciciones

		int elementos = 0;

		while (elementos < 2) { 
			System.out.println("Ingrese la cantidad de elementos del vector: ");
			elementos = sc.nextInt ();
			
			if (elementos < 2)
				System.out.println ("-- Ingrese una opción valida --");
		}

		// Ingresar si rotar a la derecha o a la izquierda

		int opcion = 0;

		while (!(opcion == 1 || opcion == 2)) { 
			System.out.println ("Ingrese 1 si desea rotar a la derecha o 2 si desea rotar a la izquierda: ");
			opcion = sc.nextInt ();
			
			if (!(opcion == 1 || opcion == 2))
				System.out.println ("-- Ingrese una opción valida --");
		}

		// Ingresar la cantidad de rotaciones

		int rotaciones = 0;

		while (rotaciones <= 0) { 
			System.out.println ("Ingrese la cantidad de rotaciones: ");
			rotaciones = sc.nextInt ();
			
			if (rotaciones <= 0)
				System.out.println ("-- Ingrese una opción valida --");
		}

		// Crear el vector y rellenarlo con numero aleatorios

		int [] vect = new int [elementos];
		System.out.println ("-- Llenar vector --");
		llenarVector (vect);
		
		// Mostrar vector original
		
		System.out.println ("-- Imprimir vector --");
		imprimirVector (vect);
		
		// Rotar vector
		
		if (opcion == 1) {
			System.out.println ("-- Rotar derecha --");
			rotarVectorDer (vect, rotaciones);
		}
		
		else if (opcion == 2) {
			System.out.println ("-- Rotar izquierda--");
			rotarVectorIzq (vect, rotaciones);
		}
		
		// Mostrar vector rotado
	
		System.out.println ("-- Imprimir vector --");
		imprimirVector (vect);
		
	}
	
	static void llenarVector (int [] vect)
	{
            int n1=2;
		for (int i = 0; i < vect.length; i++){
			vect [i] = n1;
                n1=n1+2;
                }
	}
	
	static void imprimirVector (int [] vect)
	{
		for (int i = 0; i < vect.length; i++)
			System.out.print (String.format("%4d",vect [i]));

		System.out.println ();
	}
	
	static void rotarVectorDer (int [] vect, int repeticiones)
	{
		for (int i = 1; i <= repeticiones; i++) {
			int aux = vect[vect.length - 1];
			
			for (int j = vect.length - 2; j >= 0; j--) {
				vect[j + 1] = vect[j];
			}

			vect[0] = aux;
		}
	}

	static void rotarVectorIzq (int [] vect, int repeticiones)
	{
		for (int i = 1; i <= repeticiones; i++) {
			int aux = vect[0];

			for (int j = 0; j < vect.length - 1; j++) {
				vect[j] = vect[j + 1];
			}

			vect[vect.length - 1] = aux;
		}
	}
}
