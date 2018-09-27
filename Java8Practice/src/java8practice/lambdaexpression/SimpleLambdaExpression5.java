package java8practice.lambdaexpression;

public class SimpleLambdaExpression5 {
	public static void main(String args[]){
		NoParamFI obj = () -> "I have nothing to say";
		System.out.println(obj.noParamMeth());
	}
}


@FunctionalInterface
interface NoParamFI{
	String noParamMeth();
}
	
