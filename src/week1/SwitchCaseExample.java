package week1;

import java.util.Scanner;

public class SwitchCaseExample
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month");
        String nameOfMonth=sc.nextLine();
        String month=  nameOfMonth.toLowerCase();
        int noOfDays=0;

        switch (month)
        {
            case "january":
            case "march" :
            case "may" :
            case "july" :
            case "august":
            case "october" :
            case "december" :
                noOfDays = 31;
                break;
            case "february" :
                noOfDays = 28;
                break;
            case "april" :
            case "june" :
            case "september" :
            case "november" :
                noOfDays = 30;
                break;

        }

        System.out.println("The no of days in "+month+ " is : " +noOfDays);
        sc.close();
    }
}
