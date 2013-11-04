package paperless;
public class Choice {

	private boolean correct;
	private String text;
	
	public Choice(String t, boolean c){
		this.text = t;
		this.correct = c;
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
