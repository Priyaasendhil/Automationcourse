package week2;

public class StringOperation {

	public static void main(String[] args) {
		
		String str= "Automation";
		String str1="Testing";
		String str2="automation";
		
		
		//   Concatination of two strings
		
		String str3= str.concat(str1);
		System.out.println("Concatinated String : "+str3);
		
		// Lengtth of a String
		
		int lengthOfString = str.length();
		System.out.println("Length of a String : "+lengthOfString);
		
		// Convert String to uppercase and lowercase
		
		System.out.println(" String str in UPPERCASE: "+ str.toUpperCase());
		System.out.println(" String str in lowercase: "+ str.toLowerCase());
		
		// Substring of given string
		
		String str4= str.substring(0, 4);
		System.out.println(" Substring of given string from 0 to 4 : "+ str4);
		
		// compare two strings using ignorecase
		
		boolean eqIgnorecase = str.equalsIgnoreCase(str2);
		System.out.println("The result of comparing two strings : "+eqIgnorecase);
		
		// Convert string to integer
		String str5="12345";
		int number= Integer.parseInt(str5);
		System.out.println("String to integer : "+number);
		
		
		// Convert string to integer
		int numb = 678;
		String str6= String.valueOf(numb);
		String str7= Integer.toString(numb);
		
		System.out.println("Integer to String using valueof() : "+ str6);
		System.out.println("Integer to String using tostring() : "+ str7);
		
		// Remove white space in a string
		String str8="  Quality Assurence  ";
		System.out.println("Trimmed String: "+str8);
		System.out.println("String without white space using charat() and char array :");
		
		char[] ch=new char[str8.length()-1];
		
		for(int i=0;i<(str8.length());i++)
				{
			      if (str8.charAt(i) == ' ')
			      {
			    	continue; 
			      }
			      else
			      {
			        ch[i]= str8.charAt(i);
			      }
			      System.out.print(ch[i]);
				}
		
		
		System.out.println("");
		
		System.out.println("String without white space using replace method:"+str8.replaceAll("\s", ""));

	}

}
