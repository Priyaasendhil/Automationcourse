package week2;

public class StudentDetail {

	public static void main(String[] args) {


		Student s1=new Student();
		s1.getStuData(123, "Priyaa");
		s1.getStuMarks(80,98,79);
		s1.display();
		System.out.println("Total marks of : "+s1.sname+" is : "+s1.totalMarks());
		
		Student s2=new Student();
		s2.getStuData(124, "Vidya");
		s2.getStuMarks(67,89,72);
		s2.display();
		System.out.println("Total marks of : "+s2.sname+" is : "+s2.totalMarks());
	}

}
