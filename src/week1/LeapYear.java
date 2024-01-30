package week1;

import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year(yyyy)");
        int year = sc.nextInt();
//
        if ((year%100)==0)
        {
            if (year%400==0)
            {
                System.out.println("The year " +year+" is a leap year.");
            }
            else
            {
                System.out.println("The year " +year+" is not a leap year.");
            }
        }
        else
        {
            if (year%4==0)
            {
                System.out.println("The year " +year+" is a leap year.");
            }
            else
            {
                System.out.println("The year " +year+" is not a leap year.");
            }
        }
        sc.close();
    }
}
