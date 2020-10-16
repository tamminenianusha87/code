package com.db;
import java.sql.*;

public class EmployeeUpdate {

	public static void main(String[] args) {
		try {
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			Connection conn=DriverManager.getConnection("jdbc:ucanaccess://C://Users//mahes//Documents//DBdemo.accdb");
			Statement st=conn.createStatement();
			String sql="select * from employee";
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				System.out.println("\n"+rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			Connection conn=DriverManager.getConnection("jdbc:ucanaccess://C://Users//mahes//Documents//DBdemo.accdb");
			PreparedStatement ps = conn.prepareStatement("UPDATE employee SET e_name=? WHERE ID=?");
			ps.setString(1, "sruthi");
			ps.setInt(2, 5);
			ps.executeUpdate();
			
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		
		
	}
	}

}
