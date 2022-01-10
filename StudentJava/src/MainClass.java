import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		Student s1= new Student("1","Arun","126A","123456","arun@gmail.com");
		Student s2= new Student("2","Irfan","126A","123456","arun@gmail.com");
		Student s3= new Student("3","Tom","126A","123456","arun@gmail.com");
		Student s4= new Student("4","Jancy","126A","123456","arun@gmail.com");
		Student s5= new Student("5","Vikram","126A","123456","arun@gmail.com");
		List<Student> studentList=new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		new StudentManager().printStudentDetails( studentList);
	}

}