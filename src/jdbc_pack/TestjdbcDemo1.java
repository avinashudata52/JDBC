package jdbc_pack;

import java.sql.*;
public class TestjdbcDemo1 {

	public static void main(String[] args) throws ClassNotFoundException ,IllegalAccessException, InstantiationException, SQLException
	{
		
		//Employee emp = (Employee) Class.forName("jdbc_pack.Employee").newInstance();
		//emp.displayMsg();
		//Class.forName("jdbc_pack.Employee");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Class loaded");
		
		String url="jdbc:mysql://localhost:3306/JDBC";
		String userName = "root";
		String password = "root";
	//	connection getConnection(string url,name,password)
		Connection con = DriverManager.getConnection(url, userName, password);
		
		System.out.println("Connection Estabilished");
		
	}

}
