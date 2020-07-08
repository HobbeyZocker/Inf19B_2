package inf19b_2.goods;

public class Wood extends good {

	private String type, form;
	
	public Wood() {
		super.name = 'w';
	}
	
	public void setType (String type) {
		this.type = type;
	}
	
	public String getType () {
		return this.type;	
	}
	
	public void setForm (String form) {
		this.form = form;
	}
	
	public String getForm() {
		return this.form;	
	}
	
	
	
	
}
