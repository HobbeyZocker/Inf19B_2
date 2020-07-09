package inf19b_2.goods;

public class Stone extends good {

	private String type, weight;

	public Stone(String type, String weight) {
		super.name = 's';

		if (type.equalsIgnoreCase("mamor") || type.equalsIgnoreCase("granit") || type.equalsIgnoreCase("sandstein"))
			this.type = type.toLowerCase();
		else
			throw new RuntimeException("Falscher Stein Typ");

		if (weight.equalsIgnoreCase("leicht") || weight.equalsIgnoreCase("mittel") || weight.equalsIgnoreCase("schwer"))
			this.weight = weight.toLowerCase();
		else
			throw new RuntimeException("Falsches Stein Gewicht");
	}

	public String getType() {
		return this.type;
	}

	public String getWeight() {
		return this.weight;
	}

}
