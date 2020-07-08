package java26.exam;

import java.util.*;

public class StudentTest {
	public static void main(String[] args) {
		// String[] stud=new String[4];

//		ArrayList<Student> manage=new ArrayList<Student>();
		HashMap<String, Student> manage = new HashMap<>();
		Scanner s = new Scanner(System.in);

		System.out.println("�л� �̸�, �а�, �й�, ������� �Է��ϼ���.");
		while (true) {
			System.out.print(">> ");
//			String name=s.next();
//			String classname=s.next();
//			String StudentID=s.next();
//			double avgScore=s.nextDouble();

			String line = s.nextLine();
			if (line.equals("�׸�"))
				break;
			String[] split = line.split(",");

			String name = split[0].trim();
			String classname = split[1].trim();
			String StudentID = split[2].trim();
			double avgScore = Double.parseDouble(split[3].trim());

//			manage.add(new Student(name,classname,StudentID,avgScore));
			manage.put(name, new Student(name, classname, StudentID, avgScore));
		}
		
		while (true) {
			boolean exists = false;
			System.out.println(">>�л� �̸�: ");
			String nm = s.next();
			if (nm.equals("�׸�"))
				break;
			Set<String> key = manage.keySet();
			Iterator<String> it = key.iterator();
			while (it.hasNext()) {
				String keyName = it.next();
				System.out.println(keyName);
				if (keyName.equals(nm)) {
					System.out.println(manage.get(nm));
					exists = true;
					break;
				}
			}
//			for(Student stu:manage) {
//				if(stu.getName().equals(nm)) {
//					System.out.println(stu);
//					exists=true;
//					break;
//				}
//			}
			if (exists == false) {
				System.out.println("�ش��ϴ� �л��� �����ϴ�");
			}

		}
		s.close();

	}

}
