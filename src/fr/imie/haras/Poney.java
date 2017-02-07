package fr.imie.haras;

public class Poney {
	private int id;
	private String name;
	private int weight;

	public void addDada(){
		System.out.println("Nom :");
		this.setName("NOM");
		System.out.println("Weight :");
		this.setWeight(42);

		//INSERT INTO poney VALUES nom weight
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
}
