package inf19b_2.goods;

import java.util.Objects;

public class Wood extends good {

	private String type, form;

	public Wood(String type, String form) {

		if (type.equalsIgnoreCase("kiefer") || type.equalsIgnoreCase("buche") || type.equalsIgnoreCase("eiche"))
			this.type = type.toLowerCase();
		else
			throw new RuntimeException("Falscher Stein Typ");

		if (form.equalsIgnoreCase("bretter") || form.equalsIgnoreCase("balken") || form.equalsIgnoreCase("scheit"))
			this.form = form.toLowerCase();
		else
			throw new RuntimeException("Falsches Stein Gewicht");

		if (Objects.equals(this.form, "balken"))
			super.name = 'b';
		else
			super.name = 'w';

	}

	public String getType() {
		return this.type;
	}

	public String getForm() {
		return this.form;
	}

	public String toString() {
		return "wood";
	}
	
}


