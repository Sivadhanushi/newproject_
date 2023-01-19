package newproject;

import java.util.Scanner;

public class arraylargestsmallest {

	public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter limit :");
            int n=in.nextInt();
            
            
            int a[]=new int[n];
            int largest=a[0];
            int smallest=a[0];
            for(int i=0;i<n;i++)
            {
            	a[i]=in.nextInt();
            }
            for(int i=0;i<a.length;i++)
            {
            	if(a[i]>largest)
            	
            		largest=a[i];
            	
              if(a[i]<smallest)
            	
            		smallest=a[i];
            	
            }
            System.out.println("Largest Number is " +largest);
            System.out.println("smallest Number is " +smallest);

	}

}
