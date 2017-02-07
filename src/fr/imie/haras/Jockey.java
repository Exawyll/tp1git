package fr.imie.haras;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.imie.jdbc.JdbcConnect;

public class Jockey {

	private int id;
	private String firstname;
	private String lastname;
	private int weight;
	
	public void insert() {
		try {
			PreparedStatement ps = JdbcConnect.getInstance().prepareStatement("insert into jockey values (default, ?, ?, ?);");
			ps.setString(1, this.firstname);
			ps.setString(2, this.lastname);
			ps.setInt(3, this.weight);
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void select(int id) {
		try {
			PreparedStatement ps = JdbcConnect.getInstance().prepareStatement("SELECT * FROM poney WHERE id=?;");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				System.out.println("Jockey: "+ rs.getString("firstname") + " " + rs.getString("lastname"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Jockey: "+ this.firstname + " " + this.lastname;
	}
}
