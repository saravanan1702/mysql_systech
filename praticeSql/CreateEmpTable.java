package praticeSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateEmpTable {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(DBInfo.dbURL, DBInfo.dbUser, DBInfo.dbPwd);
			Statement st = con.createStatement();
			String qry = "create table if not exists emp(eid int primary key auto_increment,ename varchar(10) not null,sal numeric(10,2) not null check(sal>=10),da numeric(8,2) as (sal*20.0/100),hra numeric(8,2) as (sal*15.0/100),pf numeric(8,2) as (sal*35.0/100),gpay numeric(10,2) as (sal+da+hra),npay numeric(10,2) as (gpay-pf))auto_increment=1001";
			st.execute(qry);
			st.close();
			con.close();
			System.out.println("Table is created....");

		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
