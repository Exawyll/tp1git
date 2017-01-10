package fr.imie.haras;

public class Jockey {
	
	private String name;
	private String age;
	private Poney monCheval;
	
	/**
	 * Constructor
	 */
	public Jockey() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Custom constructor
	 * @param name
	 * @param age
	 * @param monCheval
	 */
	public Jockey(String name, String age, Poney monCheval) {
		this.name = name;
		this.age = age;
		this.monCheval = monCheval;
	}
	
	/*************************************
	 * GETTERS & SETTERS
	 *************************************/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Poney getMonCheval() {
		return monCheval;
	}

	public void setMonCheval(Poney monCheval) {
		this.monCheval = monCheval;
	}
}
