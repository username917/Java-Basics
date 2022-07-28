//this class is going to write data to the MySQL database

import java.sql.*;

public class Create extends View {
	
	String movie = "";
	String idx = "";
	String release = "";

	
	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

	public String getIdx() {
		return idx;
	}

	public void setIdx(String idx) {
		this.idx = idx;
	}

	public String getMoive() {
		return movie;
	}

	public void setMovie(String city) {
		this.movie = city;
	}

	

	public void writeDatatoMySQL() {
		
		
	
		//using preparedstatement for the purpose
		
		/*
		 * Steps to enter data into a MySQL database
		 * 1. Create a connection to our Java database
		 * 2. Create a SQL INSERT statement, using Java PreparedStatement syntax
		 * 3. Set the fields of our Java PreparedStatement object
		 * 4. Execute a Java PreparedStatement
		 * 5. Close our Java MySQL database connection
		 * 6. Catch any SQL exceptions that may come up during the process
		 */
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dvd_collection","root","password");
			
			String query = "insert into dvd_collection.dvd_collection (movie_id, title, release_date)" + " values (?, ?, ?);";
			
			//create the mysql insert preparedstatement
			PreparedStatement prepStmt = con.prepareStatement(query);

			prepStmt.setInt(1, Integer.parseInt(idx));
			prepStmt.setString(2, movie);
			prepStmt.setString(3,  release);
	
			//execute teh prepared statement
			prepStmt.execute();
			
			con.close();
			
		} catch(Exception e) {
			
			System.err.println("Error! " + e.getMessage());
			
		}

	}
}
