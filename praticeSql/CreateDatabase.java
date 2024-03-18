package praticeSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDatabase {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(DBInfo.dbURL,DBInfo.dbUser,DBInfo.dbPwd);
			Statement st=con.createStatement();
			String qry="create database if not exists company";
			
			if(st.execute(qry)) {
				System.out.println("Database Created...");
			}else {
				
				System.out.println("Database connected...");
			}
			st.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
