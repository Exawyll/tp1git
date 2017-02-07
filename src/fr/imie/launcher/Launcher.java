package fr.imie.launcher;

import java.sql.Connection;

import fr.imie.haras.Poney;
import fr.imie.jdbc.JdbcConnect;

public class Launcher {
	
	private static Connection myBdd = JdbcConnect.getInstance();

	public static void main(String[] args) {
		
		
		Poney poney1 = new Poney();
		poney1.setName("Gilbert");
		poney1.setWeight(95);
//		poney1.insert();
		
		System.out.println("Inserted");
		
		poney1.select(8);
	}
	
	

}
