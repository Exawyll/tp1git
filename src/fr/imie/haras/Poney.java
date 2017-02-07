package fr.imie.haras;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.imie.jdbc.JdbcConnect;

public class Poney {
	private int id;
	private String name;
	private int weight;
	
	public void insert() {
		try {
			PreparedStatement ps = JdbcConnect.getInstance().prepareStatement("insert into poney values (default, ?, ?);");
			ps.setString(1, this.name);
			ps.setInt(2, this.weight);
			
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
				System.out.println("Poney: "+ rs.getString("name"));
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return "Poney: " + this.name + " Poids : " + this.weight;
	}
}
