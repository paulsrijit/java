
public class AssertWithSwith {
	public static void main(String[] args) {
		// Consider expecting only 1,2 or 3 as switch case
		new AssertWithSwith().switchTest(0);
	}
	
	void switchTest(int x) {
		switch(x) 
		{  
		    case 1:
		        System.out.println("X=1");
		        break;  
		    case 2:
		    	System.out.println("X=2");
		        break;  
		    case 3:
		    	System.out.println("X=3"); 
		        break;  
		    default: assert false : "Input should be between 1-3";  
		} 
	}
}
