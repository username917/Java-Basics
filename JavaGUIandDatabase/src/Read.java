import java.awt.Component;
import java.awt.List;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import javax.swing.DefaultListModel;
import javax.swing.JList;



public class Read extends View {

	String text = "";

	public void readData() {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dvd_collection", "root",
					"password");

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("Select * from dvd_collection.movies");

			ArrayList<String> movies = new ArrayList<String>();

		

			while (rs.next()) {

				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
				
				text = rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3);

				movies.add(text);
			
				list.setListData(movies.toArray());
			}

			
			
			con.close();
			
			// list.setListData(movies.toArray());
			// list.setModel(DLM);

		} catch (Exception e) {

			System.out.println("Connection lost");

		}
	}

}
