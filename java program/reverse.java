package newproject;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		  int n;
		  System.out.print("Enter Number : ");
	       Scanner in = new Scanner(System.in);
	       n=in.nextInt();
	       int reverse=0,rem,sub=0;
	       while(n!=0)
	       {
	    	   rem=n%10;
	    	   reverse=(reverse*10)+rem;
	    	   n=n/10;
	       }
    	   sub = n-reverse;

	       System.out.println("reverse : "+reverse);
	       System.out.println("Difference : "+sub);
	       
	       

	}

}
