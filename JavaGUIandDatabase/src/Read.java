
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class Read extends View {

	String text = "";

	public void readData() {
		
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
	
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dvd_collection", "root",
					"password");
	
			Statement stmt = con.createStatement();
	
			ResultSet rs = stmt.executeQuery("Select * from dvd_collection.movies");
	
			ArrayList<String> movieList = new ArrayList<String>();
		
			String text = "";
			while (rs.next()) {
				
				text = rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3);
				System.out.println(text);
	
			}
			con.close();
			
		} catch (Exception e1) {

			System.out.println("Connection lost");

		}
		
	}

}
