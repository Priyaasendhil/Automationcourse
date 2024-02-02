package week2;

import java.util.Scanner;

public class ReverseString {
	
	public static String reverse(String st)
	{
		String rev="";
		int len=st.length()-1;
		
		for (int i=len;i>=0;i--)
		{
			rev= rev + st.charAt(i);
			
		}
		return rev;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str= sc.next();
		String reverseString= reverse(str);
		
		System.out.println("Reverse String :"+reverseString);
		sc.close();

	}

}
