package data;

public class Shortcut {

	private String name;
	private String image;
	
	public Shortcut(String image) {
		this(image, null);
	}

	public Shortcut(String name, String image) {
		this.name = name;
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public String getImage() {
		return image;
	}

}
