package data;

public class Kostenstelle {

	private String name, kathegorie, datum, gruppe;
	
	public Kostenstelle(String name, String kathegorie, String datum, String gruppe) {
		this.name = name;
		this.kathegorie = kathegorie;
		this.datum = datum;
		this.gruppe = gruppe;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKathegorie() {
		return kathegorie;
	}

	public void setKathegorie(String kathegorie) {
		this.kathegorie = kathegorie;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public String getGruppe() {
		return gruppe;
	}

	public void setGruppe(String gruppe) {
		this.gruppe = gruppe;
	}

}
