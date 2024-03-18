package systech.cmr2spr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteStdRec {
	public static void main(String[] args) {
      try {
    	  Class.forName("com.mysql.jdbc.Driver");
    	  Connection con=DriverManager.getConnection(StudentsDetails.dbURL,StudentsDetails.dbUser,StudentsDetails.dbPwd);
    	  Statement st=con.createStatement();
    	  String stdQry="delete from examresult where sname='X3'";
    	  st.executeUpdate(stdQry);
    	  st.close();
    	  con.close();
    	  System.out.println("Deleted successfully...");
      }catch(Exception e) {
    	  System.out.println(e);
      }
	}
}
