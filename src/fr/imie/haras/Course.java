package fr.imie.haras;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.imie.jdbc.JdbcConnect;

public class Course {
	private int id;
	private Date date;
	
	public void insert() {
		try {
			PreparedStatement ps = JdbcConnect.getInstance().prepareStatement("insert into course values (default, ?);");
			ps.setDate(1, this.date);
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void select(int id) {
		try {
			PreparedStatement ps = JdbcConnect.getInstance().prepareStatement("SELECT * FROM course WHERE id=?;");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				System.out.println("Course: "+ rs.getDate(1));
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
