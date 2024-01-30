package week1;

import java.util.Scanner;

public class Palindrome
{
    public static int Noofdigits(int number)
    {
        int noOfDigits=0;

        while(number>0)
        {
            number=number/10;
            noOfDigits=noOfDigits+1;
        }
        return noOfDigits;
    }

    public static int reverse(int number)
    {
        int nofdigit=Noofdigits(number);
        int rev_number=0;
        while(number>0)
        {
            nofdigit=nofdigit-1;
            int temp=number%10;
            int j=(int) Math.pow(10, nofdigit);
            rev_number=(temp*j) + rev_number;
            number=number/10;
        }
        return rev_number;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int actual_number=number;
        int reverse_num=reverse(number);

        System.out.println("Reverse of "+number+" is :"+reverse_num);

        if (actual_number == reverse_num)
        {
            System.out.println(" The number is palindrome");

        }
        else
        {
            System.out.println("The number is not palindrome");
        }

        sc.close();

    }
}
