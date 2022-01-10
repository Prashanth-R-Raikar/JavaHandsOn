import java.util.Iterator;
import java.util.List;

public class StudentManager {
	public void printStudentDetails(List<Student> studentList){
		Iterator<Student> iterator=studentList.iterator();
		while(iterator.hasNext()){
			System.out.println("RollNo: "+ student.getRollNo());
			System.out.println("Name: "+ student.getName());
			System.out.println("Addess: "+ student.getAddress());
			System.out.println("Phone: "+ student.getPhone());
			System.out.println("Email: "+ student.getEmail());
		}
	}
}
