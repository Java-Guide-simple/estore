package in.stack.eStore.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnection {

	private Connection con = null;
	private Statement stmnt = null;

	// DataBase Connection
	public Statement getConnection() {
		// establish the connection
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eStore", "root", "test");
			stmnt = con.createStatement();
			return stmnt;
		} catch (Exception e) {
			System.out.println(e);
			return stmnt;
		}
	}
	
	// Close the connection
	public void closeConnection() {
		try {
			stmnt.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// DataBase Query 
/*create Database eStore
use eStore;
create table products(productId int,productName varchar(30),
quantity int ,price double ,isactive boolean ,constraint pk primary key(productId));
select * from products*/