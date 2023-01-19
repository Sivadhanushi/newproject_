package newproject;

import java.util.Scanner;

public class sumof_array {

	public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           System.out.print("Enter Limit  : ");
           int n=in.nextInt();
           
           int arr[]=new int[n];
           System.out.print("Enter Elements  : ");
           for(int i=0;i<n;i++)
        	   arr[i]=in.nextInt();
           
           int sum=0;
           for(int i=0;i<n;i++)
           {
        	   sum=sum+arr[i];
           }
           System.out.print("Sum of Array  : "+sum);

           
	}

}
