package designpattern.behavioral.observer.example2;

public class MessageBoardExample {

	public static void main(String[] args) {
		Student student1 = new Student("Student 1");
		Student student2 = new Student("Student 2");
		Student student3 = new Student("Student 3");
		
		MessageBoard messageBoard = new MessageBoard();
		messageBoard.registerObserver(student1);
		messageBoard.registerObserver(student2);
		messageBoard.registerObserver(student3);
		
		messageBoard.setMessage("Vacation has been extended upto 1 week :)");

	}

}
