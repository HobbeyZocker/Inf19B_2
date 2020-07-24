package inf19b_2.goods;

import java.util.Objects;

public class Stone extends good {

	private String type, weight;

	public Stone(String type, String weight) {

		if (type.equalsIgnoreCase("marmor") || type.equalsIgnoreCase("granit") || type.equalsIgnoreCase("sandstein"))
			this.type = type.toLowerCase();
		else
			throw new RuntimeException("Falscher Stein Typ");

		if (weight.equalsIgnoreCase("leicht") || weight.equalsIgnoreCase("mittel") || weight.equalsIgnoreCase("schwer"))
			this.weight = weight.toLowerCase();
		else
			throw new RuntimeException("Falsches Stein Gewicht");

		if (Objects.equals(this.weight, "schwer"))
			super.name = 'h';
		else
			super.name = 's';
	}

	public String getType() {
		return this.type;
	}

	public String getWeight() {
		return this.weight;
	}
	
	public String toString() {
		return "stone";
	}

}
