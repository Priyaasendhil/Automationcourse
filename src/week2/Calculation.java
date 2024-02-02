package week2;

public class Calculation

{
	int number1;
	int number2;
	int number3;
	
	Calculation(int num1,int num2,int num3)
	{
		number1=num1;
		number2=num2;
		number3=num3;
	}
	int add()
	{
		int sum=number1+number2+number3;
		return sum;
	}
	void display()
	{
		System.out.println("Number 1 :"+number1);
		System.out.println("Number2 :"+number2);
		System.out.println("Number3 :"+number3);
	}

}
