package week2;

public class Student
{
	String sname;
	int SID;
	float sub1;
	float sub2;
	float sub3;
	
	void getStuData(int sid, String stname)
	{
		SID=sid;
		sname=stname;
		
	}
	void display()
	{
		System.out.println("Student name :"+sname);
		System.out.println("Student Id :"+SID);
		System.out.println("Student Mark1 :"+sub1);
		System.out.println("Student Mark2 :"+sub2);
		System.out.println("Student Mark3 :"+sub3);
	}
	void getStuMarks(float mark1,float mark2, float mark3)
	{
		
		sub1=mark1;
		sub2=mark2;
		sub3=mark3;
	}
	float totalMarks()
	{
		float tmarks=sub1+sub2+sub3;
		return tmarks;
	}
}
