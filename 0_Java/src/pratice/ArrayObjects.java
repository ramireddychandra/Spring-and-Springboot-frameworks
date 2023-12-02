package pratice;

class Student{
	int roll;
	int rank;
	String name;
}

public class ArrayObjects {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.rank =2;
		s1.name = "Chandu";
		s1.roll = 23;
		
		Student s2 = new Student();
		s2.rank =3;
		s2.name = "Madhu";
		s2.roll = 62;
		
		Student s3 = new Student();
		s3.rank =1;
		s3.name = "jyothi";
		s3.roll = 52;
		
		
//		Method-1 [Creating the Student Object]
//		Student student[] =new Student[3];
//		student[0] = s1;
//		student[1] = s2;
//		student[2] = s3;
//		OR
		
		
//		Method-2 [Creating the Student Object]
		Student student[] = {s1,s2,s3};

//		What ever iteration is Student Object reference so dataype is Student
		for(Student s: student)
		{
			System.out.println(s.name);
		}
	}

}
