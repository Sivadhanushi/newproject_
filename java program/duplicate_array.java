package newproject;

public class duplicate_array {

	public static void main(String[] args) {
          int arr[]=new int[] {3,5,4,3,5,4,7,1,7};
          System.out.print("Duplicates : ");
          for(int i=0;i<arr.length;i++)
          {
        	  for(int j=i+1;j<arr.length;j++)
        	  {
        		  if(arr[i]==arr[j])
        				  System.out.print(arr[j]+" ");
        	  }
        	  
          }
	}

}
