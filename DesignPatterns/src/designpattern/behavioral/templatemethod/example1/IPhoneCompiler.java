package designpattern.behavioral.templatemethod.example1;

public class IPhoneCompiler extends CrossPlatformCompiler{

	@Override
	protected void assembleSource() {
		System.out.println("iphone assembleSource");
		
	}

	@Override
	protected void convertToBinary() {
		System.out.println("iphone convertToBinary");
		
	}

}
