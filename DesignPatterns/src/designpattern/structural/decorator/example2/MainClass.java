package designpattern.structural.decorator.example2;

public class MainClass {
	public static void main(String args[]){
		Person aStudent = new NamePersonDecorator(new AgePersonDecorator(new Student(), 15), "Srijit Paul");
		aStudent.introduce();

		Person aTeacher = new AgePersonDecorator(new NamePersonDecorator(new Teacher(), "Animesh Hore"), 30);
		aTeacher.introduce();
	}
}
