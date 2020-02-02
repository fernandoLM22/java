package tarea2;

import java.util.Scanner;

public class op {

	 public static void arregloTamanio(){
		 Scanner sc =  new Scanner(System.in);
	        System.out.println("Ingrese el tamaño del arreglo");
	        int tam = sc.nextInt();
	        int[]nums = new int[tam];
	     
	        System.out.println("los numeros aleatorios son:");
	        for(int i = 0; i < nums.length; i++) {
	            nums[i] = (int)(Math.random()*10+1); 
	      
	            System.out.print(nums[i] + ",");
	        }
	        int mayor = 0;

	        for(int i = 0; i < nums.length; i++) {
	            if(nums[i] > mayor) {
	                mayor = nums[i];
	            }
	        }
	    }
	  
	        
	    }
	  