package week2;

public class CalculatorMain {

	// Method Overloading
	public static void main(String[] args) 
	{
		Calculator cal=new Calculator();
		System.out.println("Sum of two  intergers		: "+ cal.add(27,89));
		System.out.println("Sum of three  intergers		: "+ cal.add(27,89,78));
		System.out.println("Sum of two Decimal numbers	: "+ cal.add(27.6,89.5));
		System.out.println("Sum of three Decimal numbers	: "+ cal.add(27.2,89.4,67.009));
	}

}
