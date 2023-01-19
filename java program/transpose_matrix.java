package newproject;

import java.util.Scanner;

public class transpose_matrix {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Rows : ");
		int r =in.nextInt();
		System.out.print("Enter columns : ");
		int c =in.nextInt();
		
		int [][]mat = new int[r][c];
		System.out.print("Enter "+r*c+" values");

		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				mat[i][j]=in.nextInt();
		
		System.out.println("Original elements :");
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
			{
				System.out.print(mat[i][j]+"\t");

			}
		System.out.println();

		System.out.println("Transpose elements :");
		for(int i=0;i<c;i++)
			for(int j=0;j<r;j++)
			{
				System.out.print(mat[j][i]+"\t");

			}
		System.out.println();

		

		
          
	}

}
