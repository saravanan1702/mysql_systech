package systech.cmr2spr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Studentstbl {
	public static void main(String[] args) {
      try {
    	  Class.forName("com.mysql.jdbc.Driver");
    	  Connection con=DriverManager.getConnection(StudentsDetails.dbURL,StudentsDetails.dbUser,StudentsDetails.dbPwd);
    	  Statement st=con.createStatement();
    	  String stdQry="Create database if not exists " +StudentsDetails.dbName;
    	  st.execute(stdQry);
    	  st.close();
    	  con.close();
    	  System.out.println("Database Created...");
      }catch(Exception e) {
    	 System.out.println(e);
      }
	}
}
