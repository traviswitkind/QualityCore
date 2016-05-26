package DBunit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.junit.Before;

public class One {

    
    static Connection con = null; 										// Connection object
    protected static Statement stmt;										// Statement object
    public static String DB_URL = "jdbc:mysql://192.168.10.101:3306/quality_core";   	// Constant for Database URL
    public static String DB_USER = "pacificoo";		 						// Constant for Database User name
    public static String DB_PASSWORD = "RA65M0uh";						// Constant for Database Password

    @Before
    public void setUp() throws Exception {
           try{
         	  	 String dbClass = "com.mysql.jdbc.Driver";				// Make the database connection
                  Class.forName(dbClass).newInstance();
                  Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);		// Get connection to DB
                  stmt = con.createStatement();														// Statement object to send the SQL statement to the Database
}
                  catch (Exception e)
              {
                        e.printStackTrace();
                  }
    }
	
}
