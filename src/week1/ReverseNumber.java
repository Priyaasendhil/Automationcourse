package week1;

import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int rev_number;
        System.out.println("Reverse of "+number+" is :");
        while(number>0)
        {
            rev_number=number%10;
            number=number/10;
            System.out.print(rev_number);

        }

        sc.close();

    }

}
