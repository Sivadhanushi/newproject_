package newproject;
import java.util.Scanner;
public class positiveornegative {

	public static void main(String[] args) {
         int a;
         System.out.print("Enter Number : ");
         Scanner in = new Scanner(System.in);
         a=in.nextInt();
         if(a>0)
        	 System.out.println("POSITIVE");
         if(a==0)
        	 System.out.println("ZERO");
         if(a<0)
        	 System.out.println("NEGATIVE");
         
         
	}

}
