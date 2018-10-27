package designpattern.behavioral.observer.example2;

public class Student implements MyObserver{
	
	private String studentName;
	
	public Student(String studentName) {
		super();
		this.studentName = studentName;
	}

	@Override
	public void update(String message) {
		System.out.println("Message recieved :[" + message + "] by " + studentName);
	}
}
