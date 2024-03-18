package systech.cmr2spr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.ResultSet;

public class ShowStdDatabase {
	public static void main(String[] args) {
       try {
    	   Class.forName("com.mysql.jdbc.Driver");
    	   Connection con=DriverManager.getConnection(StudentsDetails.dbURL,StudentsDetails.dbUser,StudentsDetails.dbPwd);
    	   Statement st=con.createStatement();
    	   String stdQry="Select * from examresult";
    	   //result set for showing tables
    	   ResultSet rs=(ResultSet)st.executeQuery(stdQry);
    	   while(rs.next()) {
    		   System.out.print("Name   :"+rs.getString("sname")+"\t");
    		   System.out.print("Mark 1 :"+rs.getFloat("m1")+"\t");
    		   System.out.print("Mark 2 :"+rs.getFloat("m2")+"\t");
    		   System.out.print("Total  :"+rs.getFloat("total")+"\t");
    		   System.out.print("Average:"+rs.getFloat("average")+"\t");
    		   System.out.print("Result  :"+rs.getString("result")+"\t");
    		   System.out.println("\n---------------------------------------------------------------------------------------------");
    		   
    	   }
    	   st.close();
    	   con.close();
       }catch(Exception e) {
    	   System.out.println(e);
       }
	}
}
