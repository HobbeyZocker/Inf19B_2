package inf19b_2.goods;

public class Stone extends good {

	private String type, weight;

	public Stone() {
		super.name = 's';
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getWeight() {
		return this.weight;
	}

}
