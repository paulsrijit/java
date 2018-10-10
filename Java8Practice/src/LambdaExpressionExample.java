
public class LambdaExpressionExample {

	public static void main(String[] args) {
		/*MyInterface obj = new MyInterface() {
			
			@Override
			public int add(int x, int y) {				
				return x+y;
			}
		};*/
		
		MyInterface obj = (int x, int y) -> (x+y);//
		System.out.println(obj.add(2, 3));
	}

}

interface MyInterface{
	int add(int x, int y);
}

