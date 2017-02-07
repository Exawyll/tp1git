package fr.imie.launcher;

import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import fr.imie.jdbc.JdbcConnect;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		String phrase;

		Scanner sc = new Scanner(System.in);
		phrase = "1> Ajouter un Poney\n"
				+ "2> Ajouter un Jockey\n"
				+ "3> Ajouter une Course\n"
				+ "4> Faire courir\n"
				+ "5> Afficher le rank d'un jockey et de son poney sur une course\n"
				+ "6> Quitter"				
				+ "_>: ";
		
		while (choice != 6) {
			System.out.println(phrase);
			choice = sc.nextInt();			
			switch (choice) {
			case 1:
				System.out.println("Ajouter un Poney\n");
				// ajout d'un poney
				break;
			case 2:
				System.out.println("Ajouter un Jockey\n");
				// ajout d'un jockey
				break;
			case 3:
				System.out.println("Ajouter une Course\n");
				// ajout d'une course
				break;
			case 4:
				System.out.println("Faire courir\n");
				// faire courir sur un course
				// suivant les jockey et poney selectionner
				// afficher resultat d'une cource
				break;
		}
	}
	}

}
