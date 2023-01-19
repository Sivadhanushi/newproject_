package newproject;

import java.util.Scanner;

public class printletters {

	public static void main(String[] args) {
		char a,i;
        System.out.print("Enter character :");
        Scanner in = new Scanner(System.in);
        a=in.next().charAt(0);
        for( i=a;i<='Z';i++)
        {
        	System.out.print(i);
        }
        for( i=a;i<='z';i++)
        {
        	System.out.print(i);
        }
	}

}
