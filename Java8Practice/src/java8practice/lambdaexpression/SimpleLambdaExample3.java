package java8practice.lambdaexpression;

public class SimpleLambdaExample3 {
	
	public static void main(String args[]){
		
		MyGenericFunctionalInterface<String> objString = s -> s + " anything";
		System.out.println(objString.myMethod("Srijit"));
		
		MyGenericFunctionalInterface<Integer> objInteger = i -> i*2;
		System.out.println(objInteger.myMethod(10));
	}
}

interface MyGenericFunctionalInterface<T> {
	T myMethod(T t);
}