package java29.staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee=new Student();
		
		studentLee.setStudentName("ȫ�浿");
		System.out.println(studentLee.studentName+","+studentLee.studentID);
		
		Student studentSon=new Student();
		studentSon.setStudentName("��浿");
		System.out.println(studentSon.studentName+","+studentSon.studentID);
	}

}
