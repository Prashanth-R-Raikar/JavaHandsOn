
public class StudentDet {
	private String rollNo;
	private String name;
	private String address;
	private String phone;
	private String email;
	
	public void Student(String rollNo, String name, String address, String phone, String email){
		this.rollNo= rollNo;
		this.name=name;
		this.address=address;
		this.phone=phone;
		this.email=email;
	}
	public String getRollNo(){
		return rollNo;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public String getPhone(){
		return phone;
	}
	public String getEmail(){
		return email;
	}
	
}
