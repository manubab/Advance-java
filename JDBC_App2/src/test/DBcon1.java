package test;

import java.sql.*;

public class DBcon1 {
	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "tiger");

			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("select * from emp");
			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t" + rs.getString(2));
			}
			con.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
