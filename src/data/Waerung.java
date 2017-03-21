package data;

public class Waerung {

	private int id;
	private String abkuerzung, name;
	private Double kurs;
	
	public Waerung(int id, String abkuerzung, String name, Double kurs) {
		super();
		this.id = id;
		this.abkuerzung = abkuerzung;
		this.name = name;
		this.kurs = kurs;
	}

	public Double getKurs() {
		return kurs;
	}

	public String getName() {
		return name;
	}

	public String getAbkuerzung() {
		return abkuerzung;
	}

	public int getId() {
		return id;
	}	
}
