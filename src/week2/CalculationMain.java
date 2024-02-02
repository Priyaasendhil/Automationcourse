package week2;

import java.util.Scanner;

public class CalculationMain {

	// Construtor Example
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number1; ");
		int num1=sc.nextInt();
		System.out.println("Enter number2; ");
		int num2=sc.nextInt();
		System.out.println("Enter number3; ");
		int num3=sc.nextInt();
		Calculation cal=new Calculation(num1,num2,num3);
		
		cal.display();
		
		System.out.println("Addition of three numbers :"+cal.add());
		
        sc.close();
	}

}
