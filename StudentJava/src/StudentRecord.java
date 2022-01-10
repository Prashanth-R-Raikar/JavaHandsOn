
public class StudentRecord {
	private static int studentCount;
	
	public static int getStudentCount(){
		return studentCount;
	}
public class StudentRecordExample{
	public void main(String[] args) {
			System.out.println("Count="+ StudentRecord.getStudentCount());
		}
	}
}
