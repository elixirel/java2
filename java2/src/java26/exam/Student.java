package java26.exam;

public class Student {
	
	private String name;
	private String classname;
	private String studentid;
	private double scoreavg;
	public Student(String name, String classname, String studentid, double scoreavg) {
		this.name=name;
		this.classname=classname;
		this.studentid=studentid;
		this.scoreavg=scoreavg;
	}
	
	public String getName() {
		return name;
	}

	public String getClassname() {
		return classname;
	}

	public String getStudentid() {
		return studentid;
	}

	public double getScoreavg() {
		return scoreavg;
	}
	

	public String toString() {
		return "[ "+name+", "+classname+", "+studentid+", "+scoreavg+" ]\n";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Integer.valueOf(studentid);
	}
	
	
}
