package week1;

import java.util.Scanner;

public class FibonacciSeries
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the end of range for fibonacci series");
        int number=sc.nextInt();
        int first_number=0;
        int second_number=1;
        int fib=1;
        System.out.print("The Fibonacci series: "+first_number);
        while(fib<=number)
        {
            System.out.print(" , "+fib);
            fib=first_number+second_number;
            first_number=second_number;
            second_number=fib;


        }
        sc.close();

    }

}
