package inf19b_2.goods;

public class Wood extends good {

	private String type, form;

	public Wood() {
		super.name = 'w';
		if (type.equalsIgnoreCase("kiefer") || type.equalsIgnoreCase("buche") || type.equalsIgnoreCase("eiche"))
			this.type = type.toLowerCase();
		else
			throw new RuntimeException("Falscher Stein Typ");

		if (form.equalsIgnoreCase("bretter") || form.equalsIgnoreCase("balken") || form.equalsIgnoreCase("scheit"))
			this.form = form.toLowerCase();
		else
			throw new RuntimeException("Falsches Stein Gewicht");
	}

	public String getType() {
		return this.type;
	}

	public String getForm() {
		return this.form;
	}

}
