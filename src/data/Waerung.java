package data;

public class Waerung {

	private int id;
	private String abk�rzung, name;
	private Double kurs;
	
	public Waerung(int id, String abk�rzung, String name, Double kurs) {
		super();
		this.id = id;
		this.abk�rzung = abk�rzung;
		this.name = name;
		this.kurs = kurs;
	}

	public Double getKurs() {
		return kurs;
	}

	public String getName() {
		return name;
	}

	public String getAbk�rzung() {
		return abk�rzung;
	}

	public int getId() {
		return id;
	}	
}
