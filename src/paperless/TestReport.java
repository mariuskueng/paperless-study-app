package paperless;

import java.util.ArrayList;
import java.util.List;

public class TestReport {
	
	List<MultipleChoiceQuestion> reportQuestions;
	
	public TestReport(){
		this.reportQuestions= new ArrayList<MultipleChoiceQuestion>();
	}

	public void submit() {
		for (int i = 0; i < this.reportQuestions.size(); i++) {
			System.out.println(this.reportQuestions.get(i).getText()+" - "+this.reportQuestions.get(i).isCorrect());
		}
	}

	public void addTestResult(MultipleChoiceQuestion q, boolean isResCorrect) {
		q.setCorrect(isResCorrect);
		this.reportQuestions.add(q);
	}

}
