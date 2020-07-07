package java26.exam;

import java.util.*;

public class StudentTest {
	public static void main(String[] args) {
		//String[] stud=new String[4];
		
		ArrayList<Student> manage=new ArrayList<Student>();
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		for(int i=0;i<4;i++) {
			System.out.print(">> ");
//			String name=s.next();
//			String classname=s.next();
//			String StudentID=s.next();
//			double avgScore=s.nextDouble();
			
			String line=s.nextLine();
			String[] split=line.split(",");
			
			String name=split[0].trim();
			String classname=split[1].trim();
			String StudentID=split[2].trim();
			double avgScore=Double.parseDouble(split[3].trim());
			manage.add(new Student(name,classname,StudentID,avgScore));
		}
		
		for(Student stu:manage) {
			System.out.println(stu);
		}
		s.close();
		
	}

}
