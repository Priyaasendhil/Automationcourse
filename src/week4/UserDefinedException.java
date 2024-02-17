package week4;

import java.util.Scanner;

public class UserDefinedException {

	public static void main(String[] args) throws AgeNotZeroException {
		
		
		System.out.println("Enter your Age:");
		Scanner sc = new Scanner(System.in);
		int age= sc.nextInt();
	
		if (age<=0)
		{
			throw new AgeNotZeroException("Age sholud be greater than zero");
		}
		else if (age >=1 && age<=12)
		{
			System.out.println("Chlid");
		}
		else if (age >12)
		{
			System.out.println("Adult");
		}

	}

}
