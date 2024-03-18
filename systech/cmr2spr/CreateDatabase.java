package systech.cmr2spr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDatabase {

	public static void main(String[] args) {


		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection(DBInfo.dbURL, DBInfo.dbUser, DBInfo.dbPwd);
			Statement st = cn.createStatement();
			String qry = "Create database if not exists " + DBInfo.dbName;
			st.execute(qry);
			st.close();
			cn.close();
			System.out.println("Created Database");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
