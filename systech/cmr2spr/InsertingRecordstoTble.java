package systech.cmr2spr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertingRecordstoTble {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(DBInfo.dbURL, DBInfo.dbUser, DBInfo.dbPwd);
			Statement stm = con.createStatement();
			System.out.println("Inserting records into the table...");
			String sql = "insert into students values(100,'Sam',18000,'Trichy')";
			stm.executeUpdate(sql);
			sql = "insert into students values(101,'Niklaus',25000,'Thanjavur')";
			stm.executeUpdate(sql);
			sql = "insert into students values(102,'calep',3000,'Chennai')";
			stm.executeUpdate(sql);
			sql = "insert into students values(103,'jason',2800,'Madurai')";
			stm.executeUpdate(sql);
			System.out.println("Inserted records into the table...");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
