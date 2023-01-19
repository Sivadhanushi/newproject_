package newproject;

import java.util.Scanner;

public class sumnatural {

	public static void main(String[] args) {
          int n,sum=0;
          System.out.print("Enter Number : ");
          Scanner in = new Scanner(System.in);
          n=in.nextInt();
          for(int i=1;i<=n;i++)
          {
        	  sum=sum+i;
          }
          System.out.println("Sum is " +sum);
          
        	  
	}

}
