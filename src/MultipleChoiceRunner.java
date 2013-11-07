import java.util.List;
import java.util.Timer;

import paperless.*;

/**
 * @author Sarah Hauser
 *
 */
public class MultipleChoiceRunner {

	public static void main(String[] args) {
//		runSimpleMultipleChoiceTest();
//		runAnotherTestwithHint();
//		runAnotherTestandRememberResults();
		runAnotherTestandSimulateTimer();
	}
	
	public static void runSimpleMultipleChoiceTest(){
		//create a question
		MultipleChoiceQuestion question = constructSomeQuestion();
		//print out question information
		printQuestionInfo(question);
		//print out result when selectedChoice is checked
		printResult(question, 0);
		printResult(question, 1);
	}
	
	public static void runAnotherTestwithHint(){
		MultipleChoiceQuestion question = constructSomeQuestion();
		question.setHint("Ein Schaf ist nicht bunt.");
		//print out question information
		printQuestionInfo(question);
		//print out result when selectedChoice is checked
		printResult(question, 0);
		//print out hint
		System.out.println("The hint is ...");
		System.out.println(question.getHint());
		printResult(question, 1);
	}
	
	public static void runAnotherTestandRememberResults(){
		Student anna = new Student("Anna", 123, 1234);
		//create a test
		MultipleChoiceTest someTest = new MultipleChoiceTest();
		someTest.addStudent(anna);
		someTest.addQuestion(constructSomeQuestion());
		someTest.addQuestion(constructAnotherQuestion());
		//create a test report to store the results
		TestReport report = new TestReport();
		//start the test loop through questions and store results
		List<MultipleChoiceQuestion> questions = someTest.getQuestions();
		boolean isResCorrect;
		for (MultipleChoiceQuestion q: questions){
			printQuestionInfo(q);
			//simulate that always the first question is selected
			isResCorrect = printResult(q, 0);
			//store the result
			report.addTestResult(q, isResCorrect);
		}
	}
	
	public static void runAnotherTestandSimulateTimer(){
		Student anna = new Student("Anna", 123, 1234);
		//create a test
		MultipleChoiceTest someTest = new MultipleChoiceTest();
		someTest.addStudent(anna);
		someTest.addQuestion(constructSomeQuestion());
		someTest.addQuestion(constructAnotherQuestion());
		
		//Construct an instance of Timer and TimerTask.
        Timer timer = new Timer("Printer");
        
        //Construct an object of type TimerTaks that overrides the run method to show some timer tick behavior
        ExamTimerTask examTask = new ExamTimerTask(30);
          
        //start the timer
        timer.schedule(examTask, 0, 200);
        
        //read the questions hence wait
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        //create a test report to store the results
      	TestReport report = new TestReport();
      	//start the test loop through questions and store results
        List<MultipleChoiceQuestion> questions = someTest.getQuestions();
		boolean isResCorrect;
		for (MultipleChoiceQuestion q: questions){
			printQuestionInfo(q);
			//simulate that always the first question is selected
			isResCorrect = printResult(q, 0);
			//store the result
			report.addTestResult(q, isResCorrect);
		}
        
	}
	
	public static MultipleChoiceQuestion constructSomeQuestion(){
		MultipleChoiceQuestion question = new MultipleChoiceQuestion("Welche Farbe hat ein Schaf?");
		//add choices
		question.addChoice("Blau", false);
		question.addChoice("Schwarz", true);
		question.addChoice("Gelb", false);
		question.addChoice("Weiss", true);
		return question;
	}
	
	public static MultipleChoiceQuestion constructAnotherQuestion(){
		MultipleChoiceQuestion question = new MultipleChoiceQuestion("Wie gross kšnnen Pferde sein?");
		//add choices
		question.addChoice("kleiner als 60cm", true);
		question.addChoice("gršsser als 2.5m", false);
		question.addChoice("gršsser als 20cm", true);
		question.addChoice("keine der Optionen", false);
		return question;
	}
	
	public static MultipleChoiceQuestion constructIncorrectQuestion(){
		MultipleChoiceQuestion question = new MultipleChoiceQuestion("Welche Farbe hat ein Schaf?");
		//add choices
		question.addChoice("Blau", false);
		question.addChoice("Blau", true);
		question.addChoice("Blau", false);
		question.addChoice("Blau", true);
		return question;
	}
	
	public static void printQuestionInfo(MultipleChoiceQuestion question){
		System.out.println("The question is ...");
		System.out.println(question.getText());
		List<Choice> choices = question.getChoices();
		System.out.println("The choices are ...");
		for (Choice item: choices)
		        System.out.println(item.getText()); 	
	}
	
	public static boolean printResult(MultipleChoiceQuestion question, int selectedChoice){
		//check the selected choice
		Choice selected = question.getChoice(selectedChoice);
		boolean result = selected.isCorrect();
		System.out.println("Choice? " + selected.getText() + " is " + result);
		return result;
	}

}
