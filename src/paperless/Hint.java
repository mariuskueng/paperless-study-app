package paperless;
public class Hint {

	private String hintText;
	
	public Hint(){
		this.hintText = "";
	}
	
	public Hint(String text){
		this.hintText = text;
	}

	public String getHintText() {
		return this.hintText;
	}

}
