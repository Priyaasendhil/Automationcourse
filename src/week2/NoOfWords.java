package week2;

import java.util.Scanner;

public class NoOfWords {

	public static void main(String[] args) {

     Scanner sc= new Scanner(System.in);
     System.out.println("Enter a sentence:");
     String str=sc.nextLine();
     int count =1;
     for(int i=0;i<str.length();i++)
     {
    	 if (str.charAt(i)== '\s'|| str.charAt(i)== '\n')
    	 {
    		 count =count+1;
    	 }
     }

     System.out.println("No.of words in a sentence : "+count);
     sc.close();
	}

}
