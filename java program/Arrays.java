package newproject;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

         int arr[]= {3,5,6,2,7,9,10};
         int temp;
        

         for(int i=0;i<arr.length;i++)
         {
        	 for(int j=i+1;j<arr.length;j++)
        	 {
        		 if(arr[i]>arr[j])
        		 {
        			 temp=arr[i];
        			 arr[i]=arr[j];
        			 arr[j]=temp;
        		 }
        	 }
         }
         System.out.print("Sorting :");
         for(int i=0;i<arr.length;i++)
         System.out.print(arr[i]+" ");
         
         System.out.print("\nSecond Largest is "+arr[arr.length-2]);

         
	}
		
	}


