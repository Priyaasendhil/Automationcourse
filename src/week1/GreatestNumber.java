package week1;

import java.util.Scanner;

public class GreatestNumber
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a");
        int a=sc.nextInt();
        System.out.println("Enter number b");
        int b=sc.nextInt();
        System.out.println("Enter number c");
        int c=sc.nextInt();

        if (a>b && a>c && a!=b && a!=c)
        {
            System.out.println("a is the largest :" +a );
        }
        else if (b>a && b>c && b!=a && b!=c)
        {
            System.out.println(" b is the largest : b = "+b);
        }
        else if (c>a && c>b && c!=b && c!=a)
        {
            System.out.println(" c is the largest : c = "+c);
        }
        else if (a==b && b>c && b!=c)
        {
            System.out.println("a and b are equal and largest : a = "+a+" b = "+b);
        }
        else if (a==c && c>b && c!=b)
        {
            System.out.println("a and c are equal and largest : a = "+a+" c = "+c);
        }
        else if (b==c && c>a && c!=a)
        {
            System.out.println("b and c are equal and largest : b = "+b+" c = "+c);
        }
        else
        {
            System.out.println("All are equal");
        }

        sc.close();
    }
}
