package week4;

public class UncheckedExceptionAssignment {

	public static void main(String[] args) {

try {
		int a=12;
		int b=a/0;
		
    }catch(ArithmeticException e)
    {
    	System.out.println(" The error message: "+ e);
	}

try
{
	int c[]=null;
	int d= c.length;
	System.out.println("Length of an array :"+d);
	
}catch(NullPointerException e)
{
	System.out.println(" The error message: "+ e);
}
	
try
{
	int g[]= {1,2,3,4,5,6,7,8,9};
	int h=g[11];
	
}catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println(" The error message: "+ e);
}
finally
{
	System.out.println("Finally block has executed");
}
System.out.println("End of Execution");
}
}
