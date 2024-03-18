package systech.cmr2spr;

import java.sql.Connection;
import java.sql.DriverManager;

public class SelectedDataBase {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(DBInfo.dbURL, DBInfo.dbUser, DBInfo.dbPwd);
			System.out.println("connecting to a selected Database....");
			System.out.println("Connected Database Succefully...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
