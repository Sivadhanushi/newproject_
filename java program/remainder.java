package newproject;

import java.util.Scanner;

public class remainder {

	public static void main(String[] args) {
        int a,b,c,d;
        System.out.print("Enter A and B :");
        Scanner in = new Scanner(System.in);
        a=in.nextInt();		
        b=in.nextInt();		
        c=a/b;
        d=a%b;
        System.out.println("Quotient :"+c);
        System.out.println("Remainder :"+d);

        
	}

}
