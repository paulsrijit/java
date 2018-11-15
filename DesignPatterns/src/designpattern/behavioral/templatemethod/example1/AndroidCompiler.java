package designpattern.behavioral.templatemethod.example1;

public class AndroidCompiler extends CrossPlatformCompiler {

	@Override
	protected void assembleSource() {
		System.out.println("android assembleSource");
		
	}

	@Override
	protected void convertToBinary() {
		System.out.println("android convertToBinary");
		
	}

}
