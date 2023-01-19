package newproject;

import java.util.Scanner;

public class array_reverse {

	public static void main(String[] args) {
              Scanner in = new Scanner(System.in);
              System.out.print("Enter limit");
              int n =in.nextInt();
              int arr[]=new int[n];
              System.out.print("Original elements : ");
              for(int i=0;i<n;i++)
              {
            	  arr[i]=in.nextInt();
            	  
              }
              System.out.print("Reversed elements : ");
              for(int i=n-1;i>=0;i--)
              {
            	  System.out.print(arr[i]+" ");
            	  
              }
              
              
	}

}
