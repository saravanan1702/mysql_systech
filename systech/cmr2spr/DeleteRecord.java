package systech.cmr2spr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

import com.mysql.jdbc.ResultSet;

public class DeleteRecord {
	static final String query = "select id,name,fees,address from students";
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(DBInfo.dbURL, DBInfo.dbUser, DBInfo.dbPwd);
			// Query for deleting rows
			String sql = "delete from students where id=101";
			Statement stm = con.createStatement();
			stm.executeUpdate(sql);// executing deleting query
			ResultSet rs = (ResultSet) stm.executeQuery(query);
			while (rs.next()) {
				System.out.println("ID      :" + rs.getInt("id"));
				System.out.println("Name    :" + rs.getString("name"));
				System.out.println("Fees    :" + rs.getInt("fees"));
				System.out.println("Address :" + rs.getString("address"));
				System.out.println("==============================");
			}
			rs.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
