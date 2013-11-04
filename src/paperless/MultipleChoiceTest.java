package paperless;

import java.util.ArrayList;
import java.util.List;

public class MultipleChoiceTest{
	
	private List<Student> studentList;
	private List<MultipleChoiceQuestion> questionList;
	
	public MultipleChoiceTest(){
		this.studentList = new ArrayList<Student>();
		this.questionList = new ArrayList<MultipleChoiceQuestion>();
	}

	public void addStudent(Student student) {
		studentList.add(student);	
	}

	public void addQuestion(MultipleChoiceQuestion question) {
		questionList.add(question);
		
	}

	public List<MultipleChoiceQuestion> getQuestions() {
		return this.questionList;
	}
	
	
}
