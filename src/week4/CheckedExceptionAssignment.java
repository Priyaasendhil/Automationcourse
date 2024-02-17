package week4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionAssignment {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		FileInputStream  file=new FileInputStream("input.txt");
		
		file.read();
		 
		Thread.sleep(3000);

	}

}
