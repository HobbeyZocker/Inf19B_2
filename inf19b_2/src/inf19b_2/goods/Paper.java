package inf19b_2.goods;

public class Paper extends good {

	private String color, size;

	public Paper() {
		super.name = 'p';
		if (color.equalsIgnoreCase("weiß") || color.equalsIgnoreCase("grün") || color.equalsIgnoreCase("blau"))
			this.color = color.toLowerCase();
		else
			throw new RuntimeException("Falsche Farbe");

		if (size.equalsIgnoreCase("A3") || size.equalsIgnoreCase("A4") || size.equalsIgnoreCase("A5"))
			this.size = size.toUpperCase();
		else
			throw new RuntimeException("Falsches Größe");
	}

	public String getColor() {
		return this.color;
	}

	public String getSize() {
		return this.size;
	}

}
