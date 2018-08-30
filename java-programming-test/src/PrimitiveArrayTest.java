public class PrimitiveArrayTest 
{ 
    public static void main(String[ ] args)
    { 
        float f1[ ], f2[ ]; 
        f1 = new float[10]; 
        f2 = f1; 
        System.out.println("f2[0] = " + f2[0]); 
        //When you create an array (f1 = new float[10];) the elements are initializes to the default values for the primitive data type (float in this case - 0.0)
    } 
}