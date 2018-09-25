package java8practice.lambdaexpression;

public class SimpleLambdaExample2 {

	public static void main(String[] args) {
		MyString reverseStr = (str) -> {
			String result = "";

			for (int i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);

			return result;
		};
		
		System.out.println(reverseStr.myStringFunction("Hello"));
	}

}

interface MyString {
	String myStringFunction(String s);
}
