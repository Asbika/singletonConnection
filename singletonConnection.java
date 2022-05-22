

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


// Data access object > DAO. 
public class singletonConnection {
	private static Connection connection;
	static {
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");//pilot Implementation.
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_des_projets_de_recherche","root","");//url 
			
		} catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		
		}
		
	}

	public static Connection getConnection() {
		return connection;
	}

}


