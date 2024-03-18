package systech.cmr2spr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.ResultSet;

public class PrintingDatabaseRec {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(DBInfo.dbURL, DBInfo.dbUser, DBInfo.dbPwd);
			Statement stm = con.createStatement();// crate statement
			ResultSet rs = (ResultSet) stm.executeQuery(DBInfo.Query);
			while (rs.next()) {
				System.out.println("ID :" + rs.getInt("id"));
				System.out.println("Name :" + rs.getString("name"));
				System.out.println("Fees :" + rs.getInt("fees"));
				System.out.println("Address :" + rs.getString("address"));
				System.out.println("===========================");
		

			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
