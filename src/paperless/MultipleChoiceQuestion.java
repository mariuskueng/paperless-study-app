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
		int index = choiceList.indexOf(c);
		choiceList.get(index).setSelected(true);
		return choiceList;
	}

	public List<Choice> getChoices() {
		return choiceList;
	}

	public void skip() {
		// not sure if question should be filled out as empty or
		// if the question should return at the end of the test
	}

	public void isAnswerCorrect() {
		Choice selected = null, correct=null;
		for (int i = 0; i < this.choiceList.size(); i++) {
			if(this.choiceList.get(i).getSelected()){
				selected = this.choiceList.get(i);
			}
			if(this.choiceList.get(i).getCorrect()){
				correct = this.choiceList.get(i);
			}
		}
		if(selected == correct){
			System.out.println("Answer is correct!");
			this.correct = true;
		}
		else{
			System.out.println("Answer is false!");
			this.correct = false;
		}
	}
	
	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
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
