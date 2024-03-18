package systech.cmr2spr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateStdResult {
	public static void main(String[] args) {
       try {
    	   Class.forName("com.mysql.jdbc.Driver");
    	   Connection con=DriverManager.getConnection(StudentsDetails.dbURL,StudentsDetails.dbUser,StudentsDetails.dbPwd);
    	   Statement st=con.createStatement();
    	   String stdQry="update examresult set m1=70,m2=59.5 where sname='X3'";
    	   st.executeUpdate(stdQry);
    	   st.close();
    	   con.close();
    	   System.out.println("Updated Successfully...");
    	   
       }catch(Exception e) {
    	   System.out.println(e);
       }
	}
}
