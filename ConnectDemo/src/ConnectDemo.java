import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectDemo {

	public static void main(String[] args) throws SQLException{
		
		Driver driver=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/ipm","root", "qwerty");
	
		System.out.println("Connected......");
	}

}
