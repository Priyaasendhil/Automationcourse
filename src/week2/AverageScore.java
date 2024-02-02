package week2;

import java.util.Scanner;

public class AverageScore {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of students");
		int row=sc.nextInt();
		System.out.println("enter number of subjects");
		int coloumn=sc.nextInt();
		float[][] marks=new float[row][coloumn];
		float[] avg=new float[row];

		for(int i=0;i<marks.length;i++)
		{
			for(int j=0;j<marks[i].length;j++)
			{
			System.out.println("enter the marks at ("+i+" , "+j+") :");	
			marks[i][j]=sc.nextFloat();
			}
		}
		System.out.println("");
		System.out.print("Sub1  Sub2  Sub3");	
		float classSum=0;
		for(int i=0;i<marks.length;i++)
			{
			float sum= 0;
			System.out.println("");	
			for(int j=0;j<marks[i].length;j++)
			{
			System.out.print(+marks[i][j]+"  ");	
			 sum= sum+marks[i][j];
			 avg[i]=sum/coloumn;
			 classSum =classSum+marks[i][j];
            }
			
		}
	
		System.out.println("");
		float classAvg=classSum/(row*coloumn);
		for(int k=0;k<marks.length;k++)
			
		{
			
			System.out.println("Average Mark of Student " +(k+1)+" : "+avg[k]);
			
		}
		System.out.println("");
		System.out.println("Class Average :" + classAvg);
		sc.close();

	}

}
