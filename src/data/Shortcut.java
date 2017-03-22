package data;

import java.util.Date;

public class Shortcut extends Kostenstelle {

	private String text;
	private String image;

	public Shortcut(String text, String image, String name, String kathegorie, String gruppe ) {
		super(name, kathegorie, new Date() , gruppe);
		this.text = name;
		this.image = image;
	}

	public String getText() {
		return text;
	}

	public String getImage() {
		return image;
	}

}
