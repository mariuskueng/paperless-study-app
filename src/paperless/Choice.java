package paperless;
public class Choice {

	private boolean correct;
	private boolean selected;
	private String text;
	
	
	public Choice(String t, boolean c){
		this.text = t;
		this.correct = c;
		this.selected = false;
	}
	
	public boolean getSelected() {
		return this.selected;
	}
	
	public void setSelected(boolean s){
		this.selected = s;
	}
	
	public boolean getCorrect() {
		return this.correct;
	}

	public String getText() {
		return this.text;
	}

	public boolean isCorrect() {
		return this.getCorrect();
	}

}
