package systech.cmr2spr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.ResultSet;

public class FindingAndPrintingRecord {
	static final String query = "select id,name,fees,address from students";

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(DBInfo.dbURL, DBInfo.dbUser, DBInfo.dbPwd);
			Statement stm = con.createStatement();
			System.out.println("Fetching Records without Condition....");
			ResultSet rs = (ResultSet) stm.executeQuery(query);
			while (rs.next()) {
				System.out.println("ID :" + rs.getInt("id"));
				System.out.println("Name    :" + rs.getString("name"));
				System.out.println("Fees    :" + rs.getInt("fees"));
				System.out.println("Address :" + rs.getString("address"));
				System.out.println("==============================");
			}
			System.out.println("Fetching Records with Condition...");
			String sql = "Select id,name,fees,address from students where id>=102";
			rs = (ResultSet) stm.executeQuery(sql);
			while (rs.next()) {
				System.out.println("ID :" + rs.getInt("id"));
				System.out.println("Name    :" + rs.getString("name"));
				System.out.println("Fees    :" + rs.getInt("fees"));
				System.out.println("Address :" + rs.getString("address"));
				System.out.println("==============================");
			}
			rs.close();

		} catch (Exception e) {
			System.err.println(e);
		}

	}
}
