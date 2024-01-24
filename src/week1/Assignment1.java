package week1;

import java.util.Scanner;

public class Assignment1
{
    public static void main(String[] args)
    {
        // Write a program to print hello and name.
        System.out.println("Hello");
        System.out.println("Priyaa");

// Write a program to find the sum of two numbers
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number1");
        int number1 = sc.nextInt();
        System.out.println("Enter number2");
        int number2 =sc.nextInt();
        int sum = number1 + number2;
        System.out.println(" Sum of two numbers: "+sum);
        sc.close();

// Write a Program to swap two numbers
        int a = 10;
        int b = 20;
        System.out.println(" Value of a before swap: a = "+a);
        System.out.println(" Value of b before swap: b = "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(" Value of a after swap: a =  "+a);
        System.out.println(" Value of b after swap: b = "+b);
    }

}
