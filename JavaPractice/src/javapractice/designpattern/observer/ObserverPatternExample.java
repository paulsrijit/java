package javapractice.designpattern.observer;

public class ObserverPatternExample {

	public static void main(String[] args) {
		DataStore dataStore = new DataStore();
		Screen screen = new Screen();
		
		dataStore.addObserver(screen);
		
		dataStore.setData("NewData001");
		
		dataStore.setData("NewData002");
	}

}
