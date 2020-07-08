package inf19b_2.goods;

public class Paper extends good {

	private String color, size;

	public Paper() {
		super.name = 'p';
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSize() {
		return this.size;
	}

}
