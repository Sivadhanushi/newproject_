package newproject;

import java.util.Scanner;

public class alphabetornot {

	public static void main(String[] args) {
            char a;
            System.out.print("Enter character :");
            Scanner in = new Scanner(System.in);
            a=in.next().charAt(0);
            if(a>=65 && a<=90)
            	System.out.println(a+" is Alphabet");
            if(a>=97 && a<=122)
            	System.out.println(a+" is Alphabet");
            else
            	System.out.println(a+" is not an Alphabet");

	
	}

}
