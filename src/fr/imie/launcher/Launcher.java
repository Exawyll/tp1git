package fr.imie.launcher;

import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import fr.imie.jdbc.JdbcConnect;

public class Launcher {

	public static void main(String[] args) {
		try {
		      //TEST DE CONNEXION
		      PreparedStatement prepare = JdbcConnect.getInstance().prepareStatement("SELECT * FROM classe WHERE cls_nom = ?");

		      Statement state = JdbcConnect.getInstance().createStatement();

		      JdbcConnect.getInstance().setAutoCommit(false);

		      DatabaseMetaData meta = JdbcConnect.getInstance().getMetaData();
		         
		    } catch (SQLException e) {
		      e.printStackTrace();
		    }

	}

}
