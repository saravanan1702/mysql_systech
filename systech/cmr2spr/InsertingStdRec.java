package systech.cmr2spr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertingStdRec {
	public static void main(String[] args) {
		try {
		  Class.forName("com.mysql.jdbc.Driver");
		  Connection con=DriverManager.getConnection(StudentsDetails.dbURL,StudentsDetails.dbUser,StudentsDetails.dbPwd);
		  Statement st=con.createStatement();
		  String stdQry="insert into examresult(sname,m1,m2) values('X1',36.5,43)";
		  st.execute(stdQry);
		  stdQry="insert into examresult(sname,m1,m2) values('X2',41,43.5)";
		  st.execute(stdQry);
		  stdQry="insert into examresult(sname,m1,m2) values('X3',98,20)";
		  st.execute(stdQry);
		  stdQry="insert into examresult(sname,m1,m2) values('X4',63.5,61)";
		  st.execute(stdQry);
		  st.close();
		  con.close();
		  System.out.println("Recorded inseted in tables");
		  

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
