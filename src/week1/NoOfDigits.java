package week1;

import java.util.Scanner;

public class NoOfDigits
{
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int noOfDigits=0;

        while(number>0)
        {
            number=number/10;
            noOfDigits=noOfDigits+1;
        }
        System.out.println("No.of digits in a given number "+number+" is :"+noOfDigits);
        sc.close();
    }

}
