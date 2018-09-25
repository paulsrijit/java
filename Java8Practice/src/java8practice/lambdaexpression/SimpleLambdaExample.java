package java8practice.lambdaexpression;

public class SimpleLambdaExample {

	public static void main(String[] args) {
		NumericTest square = (n) -> (n*n);		
		System.out.println(square.operate(9));
		
		NumericTest makeDouble = (n) -> (n*2);
		System.out.println(makeDouble.operate(10));
	}

}

interface NumericTest {
	int operate(int n);
}
