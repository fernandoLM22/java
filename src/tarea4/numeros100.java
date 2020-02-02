package tarea4;

public class numeros100 {
  public static void main(String []Args) {
      int[]nums = new int[100];
     int suma=0;
     int media;
      
      for (int i = 0; i < 100; i++) {
			nums[i] = i+1;
		}
   
  
      for(int i=0;i<100;i++) {
    	  
          suma= nums[i]+suma;}
  
      
      System.out.println("La suma de 1+2+3+...100 es:" +suma);  
      media= suma/100;
      System.out.println("La media aritmetica de "+suma+" es " +media);   
  }
                                                                                 
  
 
  
}
