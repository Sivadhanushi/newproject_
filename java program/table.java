package newproject;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		int i,n,t;
		Scanner in = new Scanner(System.in);
        System.out.print("Enter Table :");
        t = in.nextInt();
        System.out.print("Enter Limit :");
        n = in.nextInt();

        for(i=1;i<=n;i++)
        {
        	System.out.println(t+ "*" +i+ "=" +(t*i));	
        }
        for(i=1;i<=n;i++)
        {
        System.out.println(t+ "-" +i+ "=" +(t-i));
        }
        
        
	}

}
