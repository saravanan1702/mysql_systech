package systech.cmr2spr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CrateTable {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection(DBInfo.dbURL,DBInfo.dbUser, DBInfo.dbPwd);
			Statement st = cn.createStatement();
			String qry = "Create table students(id int primary key,name varchar(30),fees int,address varchar(50))";
			st.execute(qry);
			st.close();
			cn.close();
			System.out.println("Created Database");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
