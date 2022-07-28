import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.*;

public class Edit extends View {
	
	String idx = "";
	String title = "";
	String release = "";
	
	public String getIdx() {
		return idx;
	}

	public void setIdx(String idx) {
		this.idx = idx;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}
	
	public void updateDatabaseForDVDs() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dvd_collection","root","password");
			
			String query = "update dvd_collection.movies set title=?, release_date=? where movie_id=? ";
			
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,  title);
			ps.setString(2, release); //java.sql.Date.valueOf("1986-01-01"));
			ps.setInt(3, Integer.parseInt(idx))
;
			ps.executeUpdate();
			
			System.out.println("Record updated successfully.");
			
			
		} catch(Exception e) {
			
			System.err.println("Error! " + e.getMessage());
			
		}
		
		
		
		
		
		
	}

}
