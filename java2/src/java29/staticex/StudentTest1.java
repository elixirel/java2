package java29.staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee=new Student();
		
		studentLee.setStudentName("홍길동");
		System.out.println(studentLee.studentName+","+studentLee.studentID);
		
		Student studentSon=new Student();
		studentSon.setStudentName("고길동");
		System.out.println(studentSon.studentName+","+studentSon.studentID);
	}

}
