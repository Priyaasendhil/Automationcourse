package week1;

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        int factorial = 1;
        if (number==0 || number==1)
        {
            factorial=1;
        }
        else if(number >= 2)
        {
            for (int i=1;i<=number;i++)
            {
                factorial=i*factorial;
            }
        }
        else
        {
            System.out.println("The number is invalid");
        }
        System.out.println("Factorial of "+number+" is : "+factorial);
        sc.close();
    }

}
