package designpattern.behavioral.templatemethod.example1;

public abstract class CrossPlatformCompiler {
	public final void compile() {
		System.out.println("compile start");
		assembleSource();
		convertToBinary();
		System.out.println("compile end");
	}
	
	protected abstract void assembleSource();
	protected abstract void convertToBinary();
}
