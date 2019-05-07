import java.sql.*;

public class Write {

	public static void main(String[] args) {
String url="jdbc:mysql://localhost:3360/demo";
String username="root";
String password="sarandis10";


try {
// 1. Get a connection to the database
		
Connection connection= DriverManager.getConnection(url,username,password);
	
// 2. Create a statement
Statement statement=connection.createStatement();		
		
//3. Execute SQL Query 
String sequel="insert into employees" + "(last_name, first_name,email)" + "values('sarantis', 'antonakas', 'sarandis10@hotmail.com')";
statement.executeUpdate(sequel);
System.out.println("insert Complete:");

}
catch (Exception e){
	e.printStackTrace();
		
}	
	}
}
