package newproject;
import java.util.Scanner;
public class vowelconsonant {

	public static void main(String[] args) {
        char c;
        System.out.print("Enter Character :");
        Scanner in = new Scanner(System.in);
        c=in.next().charAt(0);
        switch(c)
        {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
        	   System.out.println("VOWEL");
        	   break;
        default:
        	System.out.println("CONSONANT");
        	break;
        }
        	

        
	}

}
