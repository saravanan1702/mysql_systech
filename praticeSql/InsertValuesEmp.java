package praticeSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertValuesEmp {
	public static void main(String[] args) {
      try {
    	  Class.forName("com.mysql.jdbc.Driver");
    	  Connection con=DriverManager.getConnection(DBInfo.dbURL,DBInfo.dbUser,DBInfo.dbPwd);
    	  Statement st=con.createStatement();
    	  String qry="insert into emp(ename,sal) values('X1',500000)";
    	  st.execute(qry);
    	  qry="insert into emp(ename,sal) values('X2',300000)";
    	  st.execute(qry);
    	  qry="insert into emp(ename,sal) values('X3',100000)";
    	  st.execute(qry);
    	  qry="insert into emp(ename,sal) values('X4',200000)";
    	  st.execute(qry);
    	  qry="insert into emp(ename,sal) values('X5',400000)";
    	  st.execute(qry);
    	  st.close();
    	  con.close();
    	  System.out.println("Values are inserted into tables");
      }catch(Exception e) {
    	  System.err.println(e);
      }
	}
}
