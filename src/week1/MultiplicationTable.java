package week1;

import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        for(int i=1;i<11;i++)
        {
            System.out.println( i +" * "+number+" = "+i*number);
        }
      sc.close();
    }
}
