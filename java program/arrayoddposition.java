package newproject;

import java.util.Scanner;

public class arrayoddposition {

	public static void main(String[] args) {
		    Scanner in= new Scanner(System.in);
		    System.out.print("Enter limit");
		    		int  n=in.nextInt();
               
		     int [] a= new int[n];
        	 System.out.println("Enter elements : ");
             for(int i=0;i<n;i++)
             {
            	 a[i]=in.nextInt();
             }
        	 System.out.println("Elements in odd position : ");

             for(int i=0;i<a.length;i=i+2)
            System.out.print(a[i]+" ");
          
             
             
            		 
	}

}
