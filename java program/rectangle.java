package newproject;

import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {
       int length,breath,area;
       System.out.print("Enter length and breath :");
       Scanner in = new Scanner(System.in);
       length=in.nextInt();
       breath=in.nextInt();
       area=length*breath;
       System.out.println("Area is "+area);

	}

}
