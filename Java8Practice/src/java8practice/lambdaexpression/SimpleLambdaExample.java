package java8practice.lambdaexpression;

public class SimpleLambdaExample {

	public static void main(String[] args) {
		NumericTest square = (n) -> (n*n);		
		System.out.println(square.operate(9));
		
		NumericTest makeDouble = (n) -> (n*2);
		System.out.println(makeDouble.operate(10));
		
		StringOperation addDash = (s) -> (s+"-");
		System.out.println(addDash.operate("Hello"));
		
		StringOperation addSurname = (s) -> (s+ " Paul");
		System.out.println(addSurname.operate("Srijit"));
	}

}

interface NumericTest {
	int operate(int n);

	@Override
	int hashCode();

	@Override
	boolean equals(Object obj);

//	Object clone() throws CloneNotSupportedException;

	@Override
	String toString();

//	void finalize() throws Throwable;
}

interface StringOperation {
	String operate(String s);
}
