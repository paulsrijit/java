package designpattern.behavioral.templatemethod.example1;

public class MainClass {

	public static void main(String[] args) {
		CrossPlatformCompiler compiler = new AndroidCompiler();
		compiler.compile();
		
		CrossPlatformCompiler compiler2 = new IPhoneCompiler();
		compiler2.compile();

	}

}
