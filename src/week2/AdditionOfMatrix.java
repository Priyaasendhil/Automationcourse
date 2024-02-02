package week2;

import java.util.Scanner;

public class AdditionOfMatrix {
	static Scanner sc=new Scanner(System.in);
	
	public static int[][] initialize(int[][] arr)
	{
		 for(int i=0;i<arr.length;i++)
	        {
	        	for(int j=0;j<arr[i].length;j++)
	        	{
	        	System.out.println("enter the element at ("+i+" , "+j+") :");	
	        	arr[i][j]=sc.nextInt();
	        	}
	        }
		return arr;
	}
	
	public static void display(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
    	{
    	System.out.println("");	
    	for(int j=0;j<arr[i].length;j++)
    	{
    	System.out.print(+arr[i][j]+"  ");	

    	}
        }
	}
	
	
	public static void main(String[] args)
	
	{
		
		System.out.println("enter number of rows");
		int row=sc.nextInt();
		System.out.println("enter number of coloumns");
		int coloumn=sc.nextInt();
		int[][] a=new int[row][coloumn];
        int[][] b=new int[row][coloumn];
        int[][] c=new int[row][coloumn];
        
         System.out.println("enter the elements in matrix1");
         a=initialize(a);
         System.out.println("enter the elements in matrix2");
         b=initialize(b);
        
         System.out.println("The elements in matrix1");
         display(a);
         System.out.println("");
         System.out.println("The elements in matrix2");
         display(b);
         
         
         for(int i=0;i<row;i++)
     	{
     		
     	for(int j=0;j<coloumn;j++)
     	{
     		c[i][j]=a[i][j]+b[i][j];
     	}
        }
         System.out.println("");
         System.out.println("The Result of Addition");
         
         display(c);

    }

}
