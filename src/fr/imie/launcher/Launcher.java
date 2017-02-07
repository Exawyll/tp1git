package fr.imie.launcher;

import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import fr.imie.jdbc.JdbcConnect;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		String phrase;

		try {
		      //TEST DE CONNEXION
		      PreparedStatement prepare = JdbcConnect.getInstance().prepareStatement("SELECT * FROM classe WHERE cls_nom = ?");

		      Statement state = JdbcConnect.getInstance().createStatement();

		      JdbcConnect.getInstance().setAutoCommit(false);

		      DatabaseMetaData meta = JdbcConnect.getInstance().getMetaData();
		         
		    } catch (SQLException e) {
		      e.printStackTrace();
		    }

		choice = 0;
		phrase = "1> Ajouter un Poney\n"
				+ "2> Ajouter un Jockey\n"
				+ "3> Ajouter une Course\n"
				+ "4> Faire courir\n"
				+ "5> Quitter"				
				+ "_>: ";
		
		while (choice != 5) {
			System.out.println(phrase);
			switch (choice) {
			case 1:
				
				break;
			case 2:
				
				break;
			default:
				break;
		}
	}
	}

}
