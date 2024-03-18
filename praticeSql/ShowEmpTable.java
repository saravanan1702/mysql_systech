package praticeSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.ResultSet;

public class ShowEmpTable {
	public static void main(String[] args) {
         try {
        	 Class.forName("com.mysql.jdbc.Driver");
        	 Connection con=DriverManager.getConnection(DBInfo.dbURL,DBInfo.dbUser,DBInfo.dbPwd);
        	 Statement st=con.createStatement();
        	 String qry="select * from emp";
        	 ResultSet rs=(ResultSet)st.executeQuery(qry);
        	 while(rs.next()) {
        		 System.out.print("ID :"+rs.getInt("eid")+"\t");
        		 System.out.print("Name :"+rs.getString("ename")+"\t");
        		 System.out.print("Sal :"+rs.getFloat("sal")+"\t");
        		 System.out.print("Da  :"+rs.getFloat("da")+"\t");
        		 System.out.print("Hra :"+rs.getFloat("hra")+"\t");
        		 System.out.print("Pf :"+rs.getFloat("pf")+"\t");
        		 System.out.print("Gpay :"+rs.getFloat("gpay")+"\t+");
        		 System.out.print("Npay :"+rs.getFloat("npay")+"\t");
        		 System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------");
        	 }
        	 
        	 st.close();
        	 con.close();
         }catch(Exception e) {
        	 System.err.println(e);
         }
	}
}
