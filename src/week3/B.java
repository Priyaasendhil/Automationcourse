package week3;

public class B implements A {

	@Override
	public int sum() {
		int c=a+b;
		return c;
	}
	public static void main(String[] args) 
	{
		B childClass=new B();
		int result= childClass.sum();
		System.out.println("The Value of a : "+a);// The variables declared in Interface are Static and Final .
		System.out.println("The Value of b: "+b);// so we can access them without object and we can't change its value. They are constants.
		System.out.println("The result of addition: "+result);
	}

}
