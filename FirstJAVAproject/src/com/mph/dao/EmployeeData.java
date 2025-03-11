package com.mph.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import com.mph.model.Employee;
import com.mph.util.MyDBConnection;
import java.sql.DatabaseMetaData;

//import com.mysql.cj.xdevapi.Result;
//import com.mysql.cj.xdevapi.Statement;
import java.sql.ResultSetMetaData;

public class EmployeeData {
	Connection con;
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;

	public void createEmp(Employee emp) {
		con = MyDBConnection.getMyDbConnection();
		try {
			if (emp.getType() == 1) {
				ps = con.prepareStatement(
						"insert into memp(empno,ename,etype,basic,hra,pf,gross,net) values(?,?,?,?,?,?,?,?)");
				ps.setInt(1, emp.getEmpno());
				ps.setString(2, emp.getEname());
				ps.setString(3, emp.getEtype());
				ps.setInt(4, emp.getSal1().getBasic());
				ps.setDouble(5, emp.getSal1().getHra());
				ps.setDouble(6, emp.getSal1().getPf());
				ps.setDouble(7, emp.getSal1().getGross());
				ps.setDouble(8, emp.getSal1().getNet());
			} else if (emp.getType() == 2) {
				ps = con.prepareStatement("insert into memp(empno,ename,etype,pay,whrs,wday,phrs,pday) values(?,?,?,?,?,?,?,?)");
				ps.setInt(1, emp.getEmpno());
				ps.setString(2, emp.getEname());
				ps.setString(3, emp.getEtype());
				ps.setInt(4, emp.getSal2().getBasic());
				ps.setDouble(5,emp.getSal2().getHrs());
				ps.setDouble(6, emp.getSal2().getDays());
				ps.setDouble(7, emp.getSal2().getHrswages());
				ps.setDouble(8, emp.getSal2().getDaywages());

			}
			int noofrows = ps.executeUpdate();
			System.out.println(noofrows + " inserted in DB successfully !!!");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void showEmp() {
		con = MyDBConnection.getMyDbConnection();

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from memp");
			while (rs.next()) {
				//String etype=rs.getString(3);
				if (rs.getString(3).equals("Fulltime")) {
					System.out.println("EmpNo --" + rs.getInt(1));
					System.out.println("EmpName --" + rs.getString(2));
					System.out.println("EmpType --" + rs.getString(3));
					System.out.println("Basic --" + rs.getInt(4));
					System.out.println("Hra --" + rs.getDouble(5));
					System.out.println("Pf --" + rs.getDouble(6));
					System.out.println("Gross --" + rs.getDouble(7));
					System.out.println("Net --" + rs.getDouble(8));
					System.out.println("*************************");
				} else if (rs.getString(3).equals("Parttime")) {
					System.out.println("EmpNo --" + rs.getInt(1));
					System.out.println("EmpName --" + rs.getString(2));
					System.out.println("EmpType --" + rs.getString(3));
					System.out.println("Payment --" + rs.getInt(9));
					System.out.println("Payment per hour --" + rs.getDouble(12));
					System.out.println("Monthly Earning --" + rs.getDouble(13));
					System.out.println("*************************");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void resultSetMetaData() {
		con=MyDBConnection.getMyDbConnection();
		ResultSetMetaData rsdata;
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery("Select * from memp");
			rsdata=rs.getMetaData();
			System.out.println("Column count:"+rsdata.getColumnCount());
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void databaseMetaData() {
		con=MyDBConnection.getMyDbConnection();
		try {
			DatabaseMetaData dbmd=con.getMetaData();
			System.out.println(dbmd.getDatabaseProductName());
			System.out.println(dbmd.getDatabaseProductVersion());
			System.out.println(dbmd.getDriverMajorVersion());
			System.out.println(dbmd.getDriverName());
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
