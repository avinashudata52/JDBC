package jdbc_pack;

import java.sql.Connection;

import com.mysql.cj.jdbc.DatabaseMetaData;

import DoctorPortal.DBUtil;

public class TestDataBaseMetaDataDemo1 {

	public static void main(String[] args) {
		
	try (Connection con = DBUtil.getConnect();)
	{
		DatabaseMetaData dbmt = (DatabaseMetaData) con.getMetaData();
		String driverName = dbmt.getDriverName();
		String driverVersion = dbmt.getDriverVersion();
		String productName = dbmt.getDatabaseProductName();
		String pversion=dbmt.getDatabaseProductVersion();
		System.out.println(driverName+ "\n "+driverVersion+ "\n "+productName+ " "+pversion);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}

}
