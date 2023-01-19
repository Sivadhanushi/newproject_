package newproject;

import java.util.Scanner;

public class oddeven {
	public static void main(String[] args) {
		int n;
		System.out.print("Enter Number :");
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		if(n%2==0)
			System.out.println("EVEN");
			else
				System.out.println("ODD");
	
	}
}
