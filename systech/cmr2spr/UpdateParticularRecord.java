package systech.cmr2spr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

import com.mysql.jdbc.ResultSet;

public class UpdateParticularRecord {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(DBInfo.dbURL, DBInfo.dbUser, DBInfo.dbPwd);
			Statement stm = con.createStatement();
			// updating specific columns
			String sql = "update students set fees=30220 where id in (100,101)";
			stm.executeUpdate(sql);
			ResultSet rs = (ResultSet) stm.executeQuery(DBInfo.Query);// this query is separate class
			while (rs.next()) {
				System.out.println("ID      :" + rs.getInt("id"));
				System.out.println("Name    :" + rs.getString("name"));
				System.out.println("Fees    :" + rs.getInt("fees"));
				System.out.println("Address :" + rs.getString("address"));
				System.out.println("==============================");

			}
		
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
