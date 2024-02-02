package week2;

public class ArrayAssignment {
	
	 
	
	public static int add(int[] arr)
	{
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			
			sum=sum+arr[i];
		}
			
		
		return sum;
		
	}
	public static float average(int[] arr) 
	{
		float average= add(arr)/arr.length;
		return average;
		
	}
	public static void oddeven(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]%2)== 0)
			{
				System.out.println(arr[i]+" is an even number");
			}
			else if (arr[i]==0)
			{
				System.out.println(arr[i]+" is Zero");
			}
			else
			{
				System.out.println(arr[i]+" is a odd number");
			}
			
		}
	}
	public static void ascending(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[i] > arr[j])
				{
					int temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Smallest number in the array: "+arr[0]);
		System.out.println("Greatest number in the array: "+arr[arr.length-1]);
		
	}
	public static void duplicate(int[] arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[i] == arr[j])
				{
				  System.out.println("Element "+j +" : " + arr[j]+" is a duplicate of element "+i +" : " +arr[i]);
				}
			}
		}
	}

	public static void main(String[] args)
	
	{
		int[] a= {1,2,3,4,8,9,14,3};
		System.out.println(" sum of array : "  +add(a));
		System.out.println(" Average of array : " +average(a));
		oddeven(a);
		ascending(a);
		duplicate(a);
		
	}

}
