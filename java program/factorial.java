package newproject;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
        int n,f=1,sum=0;
	 System.out.print("Enter Number : ");
    Scanner in = new Scanner(System.in);
    n=in.nextInt();
    for(int i=1;i<=n;i++)
    {
    	f=f*i;
    	sum=sum+f;
    }
    	System.out.println(f);
    	System.out.println(sum);

    
	}

}
