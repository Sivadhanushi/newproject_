package newproject;

public class odd_even_array {

	public static void main(String[] args) {
          int a[]= new int[] {2,3,4,5,6,7,8,9,10};
          System.out.println("Even");

          for(int i=0;i<a.length;i++)
         
        	  if(a[i]%2 == 0)
          
          System.out.println(a[i]);
          System.out.println("Odd ");

          for(int i=0;i<a.length;i++)
        	  if(a[i]%2 != 0)
          System.out.println(a[i]);
        		  
        		  
	}

}
