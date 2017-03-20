package data;

public class Waerung {

	private int id;
	private String abkürzung, name;
	private Double kurs;
	
	public Waerung(int id, String abkürzung, String name, Double kurs) {
		super();
		this.id = id;
		this.abkürzung = abkürzung;
		this.name = name;
		this.kurs = kurs;
	}

	public Double getKurs() {
		return kurs;
	}

	public String getName() {
		return name;
	}

	public String getAbkürzung() {
		return abkürzung;
	}

	public int getId() {
		return id;
	}	
}
