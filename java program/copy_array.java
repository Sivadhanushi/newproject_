package newproject;

public class copy_array {

	public static void main(String[] args) {
         int [] original = new int[]{10,30,40,50,60};
         int []copy = original;
         System.out.print("Original Array is ");
        /*  int []copy = new int[original.length];
         * for(int i=0;i<original.length;i++)
        	 copy[i]=original[i];*/
        	 
         for(int i=0;i<original.length;i++)
        	 System.out.print(original[i]+"\t");
        	 
         System.out.print("\nCopied Array is  ");
         for(int i=0;i<copy.length;i++)
        	 System.out.print(copy[i]+"\t");
         
	}

}
