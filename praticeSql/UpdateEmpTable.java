package praticeSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateEmpTable {
	public static void main(String[] args) {
      try {
    	  Class.forName("com.mysql.jdbc.Driver");
    	  Connection con=DriverManager.getConnection(DBInfo.dbURL,DBInfo.dbUser,DBInfo.dbPwd);
    	  Statement st=con.createStatement();
    	  String qry="update emp set sal=600000 where eid=1004";
    	  st.executeUpdate(qry);
    	  st.close();
    	  con.close();
    	  System.out.println("Updated Successfully....");
    	  
      }catch(Exception e) {
    	  System.err.println(e);
      }
	}
}
