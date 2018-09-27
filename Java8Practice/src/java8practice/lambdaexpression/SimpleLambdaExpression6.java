package java8practice.lambdaexpression;

public class SimpleLambdaExpression6 {

	public static void main(String[] args) {
		
		MultiParamFI obj = (i, j) -> (i + j);
		System.out.println(obj.multiParamMeth(10, 20));
	}

}

@FunctionalInterface
interface MultiParamFI {
	int multiParamMeth(int a, int b);
}
