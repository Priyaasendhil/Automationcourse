package week1;

import java.util.Scanner;

public class PositiveNumber
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();

        if(number==0)
        {
            System.out.println("Zero is neither positive nor negative");
        }
        else if(number > 0)
        {
            System.out.println("the number is positive");
        }
        else if(number < 0)
        {
            System.out.println("the number is negative");
        }
        sc.close();
    }

}
