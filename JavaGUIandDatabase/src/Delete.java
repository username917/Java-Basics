//this class is going to delete values from a database
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
	
	String idx = "";
	
	public String getIdx() {
		return idx;
	}

	public void setIdx(String idx) {
		this.idx = idx;
	}

	public  void deleteFromDVDDatabase() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dvd_collection","root","password");
			
			PreparedStatement prepStmt = con.prepareStatement("Delete from dvd_collection.movies Where movie_id=?");
			
			prepStmt.setInt(1, Integer.parseInt(idx));
			
			prepStmt.executeUpdate();
			
			System.out.println("Item deleted!");
			
		} catch (Exception e) {
			
			System.out.println("Error!" + e.getMessage());
			
			
		}
		
		
	}

}
