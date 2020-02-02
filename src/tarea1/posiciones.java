package tarea1;

import java.util.Scanner;

public class posiciones {
  public static void main  (String [] args ) {
	
	  final int tamanio=10;
	  int num[]= new int[tamanio];
	  
	  
	  rellenarArreglo();
	  
  }	  
	  
	  
	  public static void rellenarArreglo(){
		  Scanner sc = new Scanner(System.in);
		  int i;
		  int[] numeros = new int[10];


		  System.out.println("Lectura de los elementos del array: ");
		  for (i = 0; i < 10; i++) {
		      System.out.print("numeros[" + i + "]= ");
		      numeros[i] = sc.nextInt();
		  }
       }
	  
	
	
}
