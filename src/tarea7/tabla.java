package tarea7;
import java.util.Scanner;

public class tabla {

	public static void main(String[]Args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Ingresa un numero del 1 al 20");	
		int num = sc.nextInt();
		
		
	while (num<1 || num>20) {
		System.out.println("Ingresa un numero del 1 al 20");	
		 num = sc.nextInt();
		
	}
		
		    
		if (num>=1 && num<=20) {
			
			
			for (int i=1; i<11 ; i++ ) {
			    
			int	result=num*i;

			System.out.println(num+" X "+i+" = "+result)	;
				
			}
					
		} else {
			
		}
			
	}
}
