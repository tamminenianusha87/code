package com.db;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmployeeInsert {

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
			PreparedStatement ps = conn.prepareStatement("INSERT INTO employee(ID,e_name,e_add,role) VALUES ( ?,?,?,?)");
			ps.setInt(1, 6);

			ps.setString(2, "karthik");
			ps.setString(3, "hyd");
			ps.setString(4, "lead");
			
			
			int i = ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
