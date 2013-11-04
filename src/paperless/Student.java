package paperless;
public class Student {

	private int studentId;
	private int pin;
	private String name;
	
	public Student(Student s){
		this.studentId = s.studentId;
		this.name = s.name;
		this.pin = s.pin;
	}
	
	public Student(String name, int id, int pin){
		this.name = name;
		this.studentId = id;
		this.pin = pin;
	}
}
