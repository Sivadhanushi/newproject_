package newproject;

import java.util.Scanner;

public class swapnumbers {

	public static void main(String[] args) {
		int a,b,c;
        System.out.print("Enter A and B :");
        Scanner in = new Scanner(System.in);
        a=in.nextInt();		
        b=in.nextInt();
       //c=a;
        //a=b;
        //b=c;
        a=a+b;//15
        b=a-b;//5
        a=a-b;//10

        System.out.println("A :"+a);
        System.out.println("B :"+b);

	}

}
