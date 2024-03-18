package systech.cmr2spr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateStdtbl {
	public static void main(String[] args) {
       try {
    	   Class.forName("com.mysql.jdbc.Driver");
    	   Connection con=DriverManager.getConnection(StudentsDetails.dbURL,StudentsDetails.dbUser,StudentsDetails.dbPwd);
    	   Statement st=con.createStatement();
    	   String stdQry="create table if not exists examresult(rno int primary key auto_increment,sname varchar(10),m1 numeric(5,2) check (m1>=0),m2 numeric(5,2) check(m2>=0),total numeric(6,2)  as (m1+m2),average numeric (5,2) as (total/2),result char(4) as (if (m1>34.4 and m2 >34.4,'Pass','Fail')))auto_increment=1001";
    	    st.execute(stdQry);
    	    st.close();
    	    con.close();
    	    System.out.println("Table Created....");
       }catch(Exception e) {
    	   System.out.println(e);
       }
	}
}
