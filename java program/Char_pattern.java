package newproject;

import java.util.Scanner;

public class Char_pattern {

	public static void main(String[] args) {
           char ch;
           Scanner in = new Scanner(System.in);
           System.out.print("Enter Character : ");
           ch = in.next().charAt(0);
           
           for(int i=ch; i<=65;i++)
           {
               System.out.println(ch+" ");
               ch++;

           }
	}

}
