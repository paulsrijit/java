package java8practice.lambdaexpression;

public class SimpleLambdaExpression4 {
	String fiExecutor(String s, StringFI fi) {
		return fi.myMeth(s);
	}
	
	public static void main(String args[]){
		StringFI fi = s -> s + " world!";
		System.out.println(new SimpleLambdaExpression4().fiExecutor("Hello", fi));
	}
		
	
}

@FunctionalInterface
interface StringFI{
	String myMeth(String s);
	
	//String anyMeth();
}
