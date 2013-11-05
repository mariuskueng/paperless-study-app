package paperless;
import java.util.ArrayList;
import java.util.List;

public class MultipleChoiceQuestion {

	private boolean correct;
	private String question;
	private List<Choice> choiceList;
	private Hint hint;
	
	
	public MultipleChoiceQuestion(String question){
		this.question = question;
		this.choiceList = new ArrayList<Choice>();
		
		this.hint = new Hint();
	}
	
	public void addChoice(String text, boolean correct){
		choiceList.add(new Choice(text, correct));
	}

	public List<Choice> selectChoice(Choice c) {
		return null;
	}

	public List<Choice> getChoices() {
		return choiceList;
	}

	public void skip() {

	}

	public void isAnswerCorrect() {

	}
	
	public void setHint(String hint){
		this.hint = new Hint(hint);
	}
	
	public String getText(){
		return this.question;
	}
	
	public String getHint(){
		return this.hint.getHintText();
	}
	
	public String provideHint() {
		return getHint();
	}

	public Choice getChoice(int selectedChoice) {
		return this.choiceList.get(selectedChoice);
	}

}
