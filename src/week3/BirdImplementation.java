package week3;

public class BirdImplementation implements Basicnature,Basicnature2
{

	@Override
	public void fly() {
       System.out.println("Bird can fly");
		
	}

	@Override
	public void swim() {
		System.out.println("Bird can swim");
		
	}

	@Override
	public void climb() {
		
		System.out.println("Bird can't climb");
	}
	public void walk()
	{
		System.out.println("Bird can walk");
		
	}

}
