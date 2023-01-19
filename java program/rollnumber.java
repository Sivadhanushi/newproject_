package newproject;
import java.util.Scanner;

public class rollnumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("Total number of Students is 20");
       // int  n = in.nextInt();
        int a[]=new int[]{101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120};
        
        
       // System.out.println("Enter Elements :");
      	    // for(int i=0;i<a.length;i++)
      	    	// a[i]= in.nextInt();
            
            System.out.println("Group 1 :");
            for(int i=0;i<a.length;i=i+4)
              {
            	  System.out.println(a[i]);
              }
           
            System.out.println("Group 2 :");
            for(int i=1;i<a.length;i=i+4)
            {
          	  System.out.println(a[i]);
            }
            
            System.out.println("Group 3 :");
            for(int i=2;i<a.length;i=i+4)
            {
          	  System.out.println(a[i]);
            }
            
            System.out.println("Group 4 :");
            for(int i=3;i<a.length;i=i+4)
            {
          	  System.out.println(a[i]);
            } 
            	
	}

}
