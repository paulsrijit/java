package designpattern.behavioral.iterator.example1;

public class MainClass {

	public static void main(String[] args) {
		NameContainer container = new NameContainer();
		MyIterator iterator  = container.getIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
