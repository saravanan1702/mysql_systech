package praticeSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRecfromEmpTable {
	public static void main(String[] args) {
      try {
    	  Class.forName("com.mysql.jdbc.Driver");
    	  Connection con=DriverManager.getConnection(DBInfo.dbURL,DBInfo.dbUser,DBInfo.dbPwd);
    	  Statement st=con.createStatement();
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter The emp id which you want to delete ('it/s started from 1001') :");
    	  int empId=sc.nextInt();
    	  String qry="delete from emp where eid="+empId;
    	  st.executeUpdate(qry);
    	  st.close();
    	  con.close();
    	  System.out.println("Record was deleted ....");
    	  
      }catch(Exception e) {
    	  System.err.println(e);
      }
	}
}
