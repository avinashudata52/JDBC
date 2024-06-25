package jdbc_pack;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import DoctorPortal.DBUtil;

public class TestResultSetMetaData {

	public static void main(String[] args) throws SQLException {

		try(Connection con = DBUtil.getConnect();)
		{
			PreparedStatement ps = con.prepareStatement("Select * from Account_Info");
			
			ResultSet rs = ps.executeQuery();
			
			ResultSetMetaData rsmt = rs.getMetaData();
			
			String ColName = rsmt.getColumnClassName(1);
			int ColCount= rsmt.getColumnCount();
			String colType=rsmt.getColumnTypeName(2);
			String tableName=rsmt.getTableName(2);
			System.out.println(ColCount+"\n"+" "+ColName+"\n"+" "+colType+"\n"+tableName);
		}
	}

}
