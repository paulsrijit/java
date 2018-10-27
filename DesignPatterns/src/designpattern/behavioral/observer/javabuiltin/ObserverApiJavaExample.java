package designpattern.behavioral.observer.javabuiltin;

import java.util.Observable;
import java.util.Observer;

public class ObserverApiJavaExample {
	public static void main(String args[]){
		MessageBoard messageBoard = new MessageBoard();
		Student student1 = new Student(messageBoard, "Student 1");
		Student student2 = new Student(messageBoard, "Student 2");
		Student student3 = new Student(messageBoard, "Student 3");
		messageBoard.addObserver(student1);
		messageBoard.addObserver(student2);
		messageBoard.addObserver(student3);

		messageBoard.setMessage("Vacation has been extended for 1 week");
	}
}

class MessageBoard extends Observable{

	private String message;

	public void setMessage(String message){
		this.message = message;
		setChanged();
		notifyObservers();
	}

	public String getMessage(){
		return message;
	}
}

class Student implements Observer {

	private MessageBoard messageBoard;
	private String studentName;

	public Student(MessageBoard messageBoard, String studentName){
		super();
		this.messageBoard = messageBoard;
		this.studentName = studentName;
	}

	@Override
	public void update(Observable observable, Object obj){
		if(messageBoard == observable){
			System.out.println(messageBoard.getMessage() + " : message recieved "+studentName);
		}
	}
}