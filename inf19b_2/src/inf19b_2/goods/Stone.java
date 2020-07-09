package inf19b_2.goods;

public class Stone extends good {

	private String type, weight;

	public Stone(String type, String weight) {
		super.name = 's';
		this.type = type;
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public String getWeight() {
		return this.weight;
	}

}
