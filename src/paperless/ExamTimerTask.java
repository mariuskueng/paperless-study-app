package paperless;

import java.util.TimerTask;
import java.sql.Time;

public class ExamTimerTask extends TimerTask {
	
	Time time;
	long remainingTime;
	
	public ExamTimerTask(int time){
		this.remainingTime = time*60000; //convert minutes to milliseconds
		this.time = new Time(remainingTime); //create new time object
	}

	@Override
	public void run() { //gets executed after every delay
		this.remainingTime = remainingTime-1000;
		this.time.setTime(this.remainingTime);
		System.out.println("Remaining time: "+(this.time.toString()));
//		if(time>0){
//			System.out.println("Remaining time: "+(this.time--));
//		
//		}
//		else{
//			this.cancel();
//			System.out.println("The time has expired!");
//		}
		
	}
	
}
