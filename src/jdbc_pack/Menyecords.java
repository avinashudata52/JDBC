package jdbc_pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.*;

public class Menyecords {

	public static void main(String[] args) throws SQLException,ClassNotFoundException{
		// TODO Auto-generated method stub

		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CSJ","root","root");
		System.out.println("Connection Established");
		Scanner sc = new Scanner(System.in);
		int numOfRows = 0;
		System.out.println("How many employee do you want register");
		int num=sc.nextInt();
		for(int i=0; i<num; i++)
		{
		System.out.println("Enter Employee name");
		String name = sc.next();
		System.out.println("Enter Employee salary");
		double salary = sc.nextDouble();
		System.out.println("Enter Employee mob number");
		long ph = sc.nextLong();
		System.out.println("Enter Employee type");
		String empType = sc.next();
		System.out.println("Enter Employee username");
		String userName = sc.next();
		System.out.println("Enter Employee password");
		String password= sc.next();
			

		
		Statement stmt=con.createStatement();
		String insertQuery="insert into Emp_table1 (emp_name,salary,mobi,emp_type,user_name,emp_password)"+
		"values('"+name+"'"+","+salary+""+","+ph+""+",'"+empType+"''"+userName+"','"+password+"')";
	
		numOfRows = stmt.executeUpdate(insertQuery);
		
		
		System.out.println(" "+numOfRows+""+"records inserted in DB");
	}

	}
}