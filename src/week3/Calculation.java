package week3;

public class Calculation implements Addition, Multiply {

	@Override
	public int mul() {
		int z=x*y;
		return z;
	}

	@Override
	public int add() {
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		
		Calculation cal=new Calculation();
		
		System.out.println("The Value of a : "+a);// The variables declared in Interface are Static and Final .
		System.out.println("The Value of b: "+b);// so we can access them without object and we can't change its value. They are constants.
		System.out.println("The sum of a and b: "+cal.add());
		
		System.out.println("The Value of x : "+x);
		System.out.println("The Value of y: "+y);
		System.out.println("The Product of x and y: "+cal.mul());

	}

}
