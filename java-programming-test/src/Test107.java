public class Test107 implements Runnable 
{ 
    private int x; 
    private int y; 

    public static void main(String args[]) 
    {
        Test107 that = new Test107(); 
        (new Thread(that)).start(); 
        (new Thread(that)).start(); 
    } 
    public synchronized void run() 
    {
        for(int i = 0; i < 10; i++) 
        { 
            x++; 
            y++; 
            System.out.println("x = " + x + ", y = " + y); /* Line 17 */
        } 
    } 
} 
