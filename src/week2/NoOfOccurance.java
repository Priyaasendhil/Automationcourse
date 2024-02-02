package week2;

public class NoOfOccurance {

	public static void main(String[] args) {
		
		String str="Automation";
		
		String str1=str.toLowerCase();
	
		for(int i=0;i<str1.length();i++)
		{
			int count=0;
			for(int j=0;j<str1.length();j++)
			{
				if(str1.charAt(i)== str1.charAt(j))
				{
					count=count+1;
				}
			}
			System.out.println("The number of occurence of char "+str1.charAt(i)+" is :"+count);
		}
		
	}

}
